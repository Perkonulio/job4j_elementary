package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance1() {
        Point point = new Point(1, 1);
        Point point1 = new Point(2, 1);
        double expected = 1;
        assertEquals(expected, point.distance(point1), 0.1);
    }

    @Test
    public void distance2() {
        Point point = new Point(0, 2);
        Point point1 = new Point(2, 4);
        double expected = 2.8;
        assertEquals(expected, point.distance(point1), 0.1);
    }

    @Test
    public void distance3() {
        Point point = new Point(1, 4);
        Point point1 = new Point(4, 5);
        double expected = 3.1;
        assertEquals(expected, point.distance(point1), 0.1);
    }


}