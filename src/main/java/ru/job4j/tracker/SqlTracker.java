package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {
    private Connection cn;

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader()
                .getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) {
        try (PreparedStatement statement =
                     cn.prepareStatement("insert into item(name, created) values (?, ?)",
                             Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            Timestamp timestampFromLDT = Timestamp.valueOf(item.getCreated());
            statement.setTimestamp(2, timestampFromLDT);
            statement.execute();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean result = false;
        try (PreparedStatement statement =
                     cn.prepareStatement("UPDATE item SET name = ?, created=  ?  WHERE id=?")) {
            statement.setString(1, item.getName());
            Timestamp timestampFromLDT = Timestamp.valueOf(item.getCreated());
            statement.setTimestamp(2, timestampFromLDT);
            statement.setInt(3, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        try (PreparedStatement statement =
                     cn.prepareStatement("DELETE FROM item WHERE id=?")) {
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement statement =
                     cn.prepareStatement("select * from item")) {
            try (ResultSet result = statement.executeQuery()) {
                Item item = new Item(result.getInt("id"),
                        result.getString("name"),
                        result.getTimestamp("created").toLocalDateTime());
                items.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement statement =
                     cn.prepareStatement("select * from item WHERE name=?")) {
            statement.setString(1, key);
            try (ResultSet result = statement.executeQuery()) {
                Item item = new Item(result.getInt("id"),
                        result.getString("name"),
                        result.getTimestamp("created").toLocalDateTime());
                items.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item findById(int id) {
        Item item = null;
        try (PreparedStatement statement =
                     cn.prepareStatement("select * from item WHERE id=?")) {
            statement.setInt(1, id);
            try (ResultSet result = statement.executeQuery()) {
                item = new Item(result.getInt("id"),
                        result.getString("name"),
                        result.getTimestamp("created").toLocalDateTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }
}
