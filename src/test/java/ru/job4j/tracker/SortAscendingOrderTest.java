package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortAscendingOrderTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Olga"),
                new Item("Anna"),
                new Item("Mariya")
        );
        Collections.sort(items, new SortAscendingOrder());
        System.out.println(items);
        assertThat(new String[] {items.get(0).getName(), items.get(1).getName(),
                items.get(2).getName()}, is(new String[] {"Olga", "Mariya", "Anna"}));

    }
}
