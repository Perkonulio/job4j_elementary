package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void swap() {
        SwitchArray switchArray = new SwitchArray();
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        assertThat(switchArray.swap(input, 0, input.length - 1), is(expected));
    }
}