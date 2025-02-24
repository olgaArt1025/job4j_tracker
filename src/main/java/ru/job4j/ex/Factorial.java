package ru.job4j.ex;

public class Factorial {
    public static void main(String[] args) {
        new Factorial().calc(-1);

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
