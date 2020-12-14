package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void resultMaxSecond() {
        Max maximum = new Max();
        assertThat(maximum.result(5, 6), is(6));
    }

    @Test
    public void resultMaxFirst() {
        Max maximum = new Max();
        assertThat(maximum.result(6, 5), is(6));
    }

    @Test
    public void resultMaxEmpty() {
        Max maximum = new Max();
        assertThat(maximum.result(6, 6), is(6));
    }

    @Test
    public void result() {
        Max maximum = new Max();
        assertThat(maximum.result(6, 8, 10), is(10));
    }

    @Test
    public void testResult() {
        Max maximum = new Max();
        assertThat(maximum.result(6, 8, 10, 12), is(12));
    }
}