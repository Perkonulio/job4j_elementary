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

    public boolean bingoVertical(char[][] dataSymbol, int column) {
        boolean result = true;
        for (int i = 0; i < dataSymbol.length; i++) {
            for (int j = 0; j < dataSymbol.length; j++) {
                if (dataSymbol[i][column] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public char[] bingoDiagonal(char[][] dataSymbol) {
        char[] result = new char[dataSymbol.length];
        for (int i = 0; i < dataSymbol.length; i++) {
            result[i] = dataSymbol[i][i];
        }
        return result;
    }
}
