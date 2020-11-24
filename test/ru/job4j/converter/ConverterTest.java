package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rublesToDollars() {
        int in = 120;
        int expected = 2;
        Converter converter = new Converter();
        int out = converter.rublesToDollars(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void rublesToEuros() {
        int in = 140;
        int expected = 2;
        Converter converter = new Converter();
        int out = converter.rublesToEuros(in);
        Assert.assertEquals(expected, out);
    }
}