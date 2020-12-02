package ru.job4j.loop;

public class Factorial {
    public int factorio(int finishNum) {
        int fact = 1;
        if (finishNum == 0) {
            return fact;
        } else if (finishNum == 1) {
            return fact;
        } else if (finishNum > 1) {
            for (int i = 1; i <= finishNum; i++) {
                fact *= i;
            }
        }
        return fact;
    }
}
