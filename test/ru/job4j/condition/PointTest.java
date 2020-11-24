package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        double bracket1 = Math.pow(x2 - x1, 2);
        double bracket2 = Math.pow(y2 - y1, 2);
        double summary = Math.sqrt(bracket1 + bracket2);
        double expected = 1;
        assertEquals(expected, summary, 0.1);
    }

    @Test
    public void distance2() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        double bracket1 = Math.pow(x2 - x1, 2);
        double bracket2 = Math.pow(y2 - y1, 2);
        double summary = Math.sqrt(bracket1 + bracket2);
        double expected = 2.8284271247461903;
        assertEquals(expected, summary, 0.1);
    }

    @Test
    public void distance3() {
        int x1 = 1;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;
        double bracket1 = Math.pow(x2 - x1, 2);
        double bracket2 = Math.pow(y2 - y1, 2);
        double summary = Math.sqrt(bracket1 + bracket2);
        double expected = 3.1622776601683795;
        assertEquals(expected, summary, 0.1);
    }
}