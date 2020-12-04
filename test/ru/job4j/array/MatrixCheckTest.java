package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void bingo() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        boolean result = matrixCheck.bingo(input, 2);
        assertThat(result, is(true));
    }
}