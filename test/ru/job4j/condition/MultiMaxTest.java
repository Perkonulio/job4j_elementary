package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void returnMax() {
        MultiMax multiMax = new MultiMax();
        int expected = 4;
        assertEquals(expected, multiMax.returnMax(4, 3, 2));
    }

    @Test
    public void returnMax1() {
        MultiMax multiMax = new MultiMax();
        int expected = 4;
        assertEquals(expected, multiMax.returnMax(3, 4, 2));
    }

    @Test
    public void returnMax2() {
        MultiMax multiMax = new MultiMax();
        int expected = 4;
        assertEquals(expected, multiMax.returnMax(2, 3, 4));
    }
}