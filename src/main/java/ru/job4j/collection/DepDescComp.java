package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] words1 = o1.split("/");
        String[] words2 = o2.split("/");
        int rsl = words2[0].compareTo(words1[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}
