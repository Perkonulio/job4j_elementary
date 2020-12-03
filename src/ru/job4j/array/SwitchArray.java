package ru.job4j.array;

public class SwitchArray {
    public int[] swap(int[] number) {
        int temp = number[0];
        number[0] = number[number.length - 1];
        number[number.length - 1] = temp;
        return number;
    }

    public static void main(String[] args) {
        SwitchArray switchArray = new SwitchArray();
        int[] arrayNumber = new int[] {1, 4, 5, 6, 8};
        switchArray.swap(arrayNumber);
        for (int value: arrayNumber) {
            System.out.print(value + " ");
        }
    }
}
