package ru.job4j.array;

public class EqLast {
    public boolean lastElement(int[] firstArray, int[] secondArray) {
        boolean result;
        result = firstArray[firstArray.length - 1] == secondArray[secondArray.length - 1];
        return result;
    }
}
