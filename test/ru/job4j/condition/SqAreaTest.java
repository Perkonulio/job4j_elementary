package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double per = 6;
        double k = 2;
        SqArea sqArea = new SqArea();
        int expected = 2;
        assertEquals(expected, sqArea.square(per, k), 0.1);
    }
}