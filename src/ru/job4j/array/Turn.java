package ru.job4j.array;

public class Turn {
    public int[] arrayAfterTurn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tempor = array[i];
            array[i] = array[array.length - i];
            array[array.length - i] = tempor;
        }
        return array;
    }
}
