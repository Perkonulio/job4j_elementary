package ru.job4j.array;

public class FindLoop {
    public int loopFromArray(int[] arrayNumber, int number) {
        int result = -1;
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] == number) {
               result = index;
               break;
            }
        }
        return result;
    }
}
