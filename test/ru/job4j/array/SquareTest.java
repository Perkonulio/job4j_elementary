package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void squareArray1() {
        Square square = new Square();
        square.squareArray(5);
    }

    @Test
    public void squareArray2() {
        Square square = new Square();
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(square.squareArray(5), is(expected));
    }

}