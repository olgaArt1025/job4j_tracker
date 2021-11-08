package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        rsl = Character.compare(o2.charAt(1), o1.charAt(1));
        if (rsl == 0) {
            for (int i = 2; i < Math.min(o1.length(), o2.length()); i++) {
                rsl = Character.compare(o1.charAt(i), o2.charAt(i));
                if (rsl != 0) {
                    break;
                }
            }
            if (rsl == 0) {
                rsl = Integer.compare(o1.length(), o2.length());
            }
        }
        return rsl;
    }
}
