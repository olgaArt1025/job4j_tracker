package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            rst = Character.compare(left.charAt(i), right.charAt(i));
            if (rst != 0) {
                break;
            }
        }
        if (rst == 0) {
            rst = Integer.compare(left.length(), right.length());
        }
        return rst;
    }
}
