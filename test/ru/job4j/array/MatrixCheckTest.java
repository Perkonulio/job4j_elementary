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

    @Test
    public void whenHasMonoVertical() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        boolean result = matrixCheck.bingoVertical(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = matrixCheck.bingoDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = matrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = matrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        MatrixCheck matrixCheck = new MatrixCheck();
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = matrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}