package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMin1() {
        Min min = new Min();
        assertThat(min.findMin(new int[] {0, 1, 2}), is(0));
    }

    @Test
    public void findMin2() {
        Min min = new Min();
        assertThat(min.findMin(new int[] {10, 5, 5}), is(5));
    }
}