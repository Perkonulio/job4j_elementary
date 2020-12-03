package ru.job4j.array;

public class Square {
    public int[] squareArray(int lastNumber) {
        int[] result = new int[lastNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Square square = new Square();
        int[] result = square.squareArray(5);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
