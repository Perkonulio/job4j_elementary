package ru.job4j.array;

public class Min {
    public int findMin(int[] array) {
        int min = array[0];
        for (int numberFromArray : array) {
            if (numberFromArray < min) {
               min = numberFromArray;
            }
        }
        return min;
    }
}
