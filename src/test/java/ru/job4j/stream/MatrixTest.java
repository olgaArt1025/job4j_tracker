package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void convert() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5}};
        Matrix matrix1 = new Matrix();
        List<Integer> rsl = matrix1.convert(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenConvertNumbers() {
        Integer[][] matrix = {{10, 27, 13}, {41, 105, 4}};
        Matrix matrix1 = new Matrix();
        List<Integer> rsl = matrix1.convert(matrix);
        List<Integer> expected = Arrays.asList(10, 27, 13, 41, 105, 4);
        assertThat(rsl, is(expected));
    }
}