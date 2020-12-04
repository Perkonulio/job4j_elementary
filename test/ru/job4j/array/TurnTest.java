package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void arrayAfterTurn1() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5};
        turn.arrayAfterTurn(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    @Test
    public void arrayAfterTurn2() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        turn.arrayAfterTurn(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}