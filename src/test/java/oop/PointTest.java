package oop;


import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0003ThenDistance3() {
    Point a = new Point(0, 0);
    Point b = new Point(0, 3);
    double dist = a.distance(b);
    assertThat(dist, closeTo(3, 0.001));
    }

    @Test
    public void when0010ThenDistance1() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        assertThat(dist, closeTo(1, 0.001));
    }

    @Test
    public void when2000ThenDistance2() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2, 0.001));
    }
}