package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short height = 180;
        Fit fit = new Fit();
        double result = 92;
        double out = fit.manWeight(height);
        assertEquals(result, out, 0.1);
    }

    @Test
    public void womanWeight() {
        short height = 180;
        Fit fit = new Fit();
        double result = 80.5;
        double out = fit.womanWeight(height);
        assertEquals(result, out, 0.1);
    }
}