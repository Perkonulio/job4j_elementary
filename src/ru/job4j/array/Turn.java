package ru.job4j.array;

public class Turn {
    public int[] arrayAfterTurn(int[] array) {
        int index = 1;
        for (int i = 0; i < array.length / 2; i++) {
            int tempor = array[i];
            array[i] = array[array.length - index];
            array[array.length - index] = tempor;
            index++;
        }
        return array;
    }
}
