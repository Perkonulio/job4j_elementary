package ru.job4j.array;

public class MatrixCheck {
    public boolean bingo(char[][] dataSymbol, int row) {
        boolean result = true;
        for (int i = 0; i < dataSymbol.length; i++) {
            if (dataSymbol[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean bingoVertical(char[][] dataSymbol, int column) {
        boolean result = true;
        for (int i = 0; i < dataSymbol.length; i++) {
            if (dataSymbol[i][column] != 'X') {
                result = false;
                break;
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

    public boolean isWin(char[][] dataSymbol) {
        boolean result = false;
        for (int i = 0; i < dataSymbol.length; i++) {
            if (dataSymbol[i][i] == 'X') {
                result = bingoVertical(dataSymbol, i) || bingo(dataSymbol, i);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}
