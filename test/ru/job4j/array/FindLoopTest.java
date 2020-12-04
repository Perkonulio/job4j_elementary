package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void loopFromArray() {
        FindLoop findLoop = new FindLoop();
        int[] number = {1, 2, 4, 5, 8};
        int expected = 3;
        assertThat(findLoop.loopFromArray(number, 5), is(expected));
    }

    @Test
    public void loopFromArrayNoExpected() {
        FindLoop findLoop = new FindLoop();
        int[] number = {1, 2, 4, 5, 8};
        int expected = 4;
        assertThat(findLoop.loopFromArray(number, 9), is(expected));
    }

    @Test
    public void loopFromArrayInRange() {
        FindLoop findLoop = new FindLoop();
        int[] inputData = {1, 2, 3, 4, 5, 8};
        int expected = 2;
        assertThat(findLoop.loopFromArrayInRange(inputData, 3, 2, 5), is(expected));
    }
}