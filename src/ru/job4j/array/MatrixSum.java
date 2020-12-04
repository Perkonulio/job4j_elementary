package ru.job4j.array;

public class MatrixSum {
    public int summary(int[][] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sum = sum + data[i][j];
            }
        }
        return sum;
    }
}
