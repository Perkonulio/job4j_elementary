package ru.job4j.array;

public class MinDiapason {
    public int findMin(int[] array, int startRange, int finishRange) {
        int min = array[startRange];
        for (int i = startRange; i <= finishRange; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }
}
