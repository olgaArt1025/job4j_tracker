package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double dist = a.distance(b);
        assertThat(dist, closeTo(3, 0.001));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 3, 0);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(3, 0.001));
    }

    @Test
    public void distance3d4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 1);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(4.358, 0.001));
    }
}