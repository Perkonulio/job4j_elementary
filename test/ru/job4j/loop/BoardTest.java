package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void board() {
        Board board = new Board();
        board.paint(5, 5);
    }
}