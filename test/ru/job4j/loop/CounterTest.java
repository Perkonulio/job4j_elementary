package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
        Counter counter = new Counter();
        int result = counter.sum(1, 5);
        int expected = 15;
        assertThat(result, is(expected));
    }

    @Test
    public void sumByEven1() {
        Counter counter = new Counter();
        int result = counter.sumByEven(1, 5);
        int expected = 6;
        assertThat(result, is(expected));
    }

    @Test
    public void sumByEven2() {
        Counter counter = new Counter();
        int result = counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}