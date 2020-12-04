package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        SkipNegative skipNegative = new SkipNegative();
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };

        int[][] rsl = skipNegative.skipNegativeNumber(in);
        assertThat(rsl, is(expect));
    }
}