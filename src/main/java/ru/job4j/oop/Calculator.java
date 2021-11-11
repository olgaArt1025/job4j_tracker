package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int b) {
        return divide(b) + minus(b) + multiply(b) + sum(b);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(5);
        int result2 = minus(5);
        System.out.println(result);
        System.out.println(result2);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl2 = calculator.divide(5);
        int rsl3 = calculator.sumAllOperation(5);
        System.out.println(rsl);
        System.out.println(rsl2);
        System.out.println(rsl3);
    }
}
