package ru.job4j.tracker;

import org.junit.*;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SqlTrackerTest {

    private static Connection connection;

    @BeforeClass
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader()
                .getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @After
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenSaveItemAndReplaceItem() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("name");
        tracker.add(item);
        tracker.replace(item.getId(), new Item("newName"));
        Assert.assertEquals(tracker.findById(item.getId()).getName(), "newName");
    }

    @Test
    public void whenSaveItemAndFindByName() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findByName("item2"), is(List.of(item2)));
    }

    @Test
    public void whenSaveItemAndFindById() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        tracker.add(item1);
        tracker.add(item2);
        Assert.assertEquals(tracker.findById(item1.getId()), item1);
    }

    @Test
    public void whenSaveItemAndDelete() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("item1");
        tracker.add(item1);
        tracker.delete(item1.getId());
        assertNull(tracker.findById(item1.getId()));
    }
}
