package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EqLastTest {

    @Test
    public void lastElement() {
        EqLast eqLast = new EqLast();
        int[] firstAr = new int[] {1, 2, 3};
        int[] secondAr = new int[] {2, 4, 3};
        assertThat(eqLast.lastElement(firstAr, secondAr), is(true));
    }

    @Test
    public void lastElementFalse() {
        EqLast eqLast = new EqLast();
        int[] firstAr = new int[] {1, 2, 3};
        int[] secondAr = new int[] {2, 4, 4};
        assertThat(eqLast.lastElement(firstAr, secondAr), is(false));
    }
}