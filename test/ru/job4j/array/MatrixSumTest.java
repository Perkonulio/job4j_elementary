package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void summary() {
        MatrixSum matrixSum = new MatrixSum();
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        assertThat(matrixSum.summary(data), is(45));
    }
}