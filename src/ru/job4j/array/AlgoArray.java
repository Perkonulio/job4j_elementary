package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 4, 1, 2 };
        //замена 5
        int tempor = array[0];
        array[0] = array[3];
        array[3] = tempor;
        //заменя 3
        tempor = array[1];
        array[1] = array[4];
        array[4] = tempor;
        //4 {1,2,4,5,3}
        tempor = array[2];
        array[2] = array[4];
        array[4] = tempor;
        //{1,2,3,5,4}
        tempor = array[3];
        array[3] = array[4];
        array[4] = tempor;

        for (int value: array) {
            System.out.print(value + " ");
        }
    }
}
