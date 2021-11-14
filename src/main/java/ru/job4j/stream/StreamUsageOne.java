package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsageOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 7, -5, -7, 4, 6));
        List<Integer> positiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);
    }
}
