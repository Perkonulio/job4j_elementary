package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void returnMax() {
        MultiMax multiMax = new MultiMax();
        int expected = 4;
        assertEquals(expected, multiMax.returnMax(2, 3, 4));
    }
}