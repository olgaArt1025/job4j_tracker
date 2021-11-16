package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(new Matrix().convert(matrix));
    }
}
