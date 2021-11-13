package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] strings = {"1", "55555", "4444", "22", "333"};
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
                return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(strings, cmpDescSize);
        System.out.println(Arrays.toString(strings));
    }
}
