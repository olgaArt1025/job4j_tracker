package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescendingOrderTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Olga"),
                new Item("Anna"),
                new Item("Mariya")
        );
        Collections.sort(items, new SortDescendingOrder());
        List<Item> rsl = Arrays.asList(
                new Item("Anna"),
                new Item("Mariya"),
                new Item("Olga")
        );
        Assert.assertEquals(items, rsl);
    }
}
