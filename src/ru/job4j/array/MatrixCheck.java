package ru.job4j.array;

public class MatrixCheck {
    public boolean bingo(char[][] dataSymbol, int row) {
        boolean result = true;
        for (int i = 0; i < dataSymbol.length; i++) {
            for (int j = 0; j < dataSymbol[i].length; j++) {
                if (dataSymbol[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
