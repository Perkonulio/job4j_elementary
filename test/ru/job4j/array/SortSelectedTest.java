package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void dataFormat() {
        SortSelected sortSelected = new SortSelected();
        int[] data = {8, 3, 2};
        int[] expected = {2, 3, 8};
        assertThat(sortSelected.dataFormat(data), is(expected));
    }

    @Test
    public void dataFormat2() {
        SortSelected sortSelected = new SortSelected();
        int[] data = {8, 3, 2, 4, 5};
        int[] expected = {2, 3, 4, 5, 8};
        assertThat(sortSelected.dataFormat(data), is(expected));
    }
}