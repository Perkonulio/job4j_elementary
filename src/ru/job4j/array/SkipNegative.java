package ru.job4j.array;

public class SkipNegative {
    public int[][] skipNegativeNumber(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = data[i][j] < 0 ? 0 : data[i][j];
            }
        }
        return data;
    }
}
