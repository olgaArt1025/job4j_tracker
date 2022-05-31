package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HbmTrackerTest {

    @Test
    public void whenAddAndFindAll() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name1");
        Item item2 = new Item("name2");
        tracker.add(item);
        tracker.add(item2);
        List<Item> all = tracker.findAll();

        assertEquals(item, all.get(0));
        assertEquals(item2, all.get(1));
        assertEquals(List.of(item, item2), tracker.findAll());
    }

    @Test
    public void whenAddAndFindNameAndId() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findByName("name2"), is(List.of(item2)));
        assertThat(tracker.findById(3), is(item3));
    }

    @Test
    public void whenAddAndDelete() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);

        tracker.delete(1);
        List<Item> all = tracker.findAll();

        assertThat(all.size(), is(2));
    }

    @Test
    public void whenAddAndReplaceAndFindId() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("name1");
        Item item2 = new Item("name2");

        tracker.add(item);
        tracker.add(item2);

        List<Item> all = tracker.findAll();
        tracker.replace(item2.getId(), new Item("newName"));

        assertThat(all.size(), is(2));
        Assert.assertEquals(tracker.findById(item2.getId()).getName(), "newName");
    }
}