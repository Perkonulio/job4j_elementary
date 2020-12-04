package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void findMin() {
        MinDiapason minDiapason = new MinDiapason();
        assertThat(minDiapason.findMin(new int[] {0, 1, 2, 3, 5, 0}, 2, 5), is(0));
    }
}