package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalcNLess0() {
        Fact.calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegativeNumber() {
        Fact.calc(-6);
    }
}