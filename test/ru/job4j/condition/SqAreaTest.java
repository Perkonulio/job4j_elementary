package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double per = 6;
        double k = 2;
        double high = per / (2 * (k + 1));
        double length = high * k;
        double result =  length * high;
        double expected = 2;
        assertEquals(expected, result, 0.1);
    }
}