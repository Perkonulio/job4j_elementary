package ru.job4j.array;

public class SwitchArray {

    public int[] swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public int[] swapBorder(int[] number) {
        int temp = number[0];
        number[0] = number[number.length - 1];
        number[number.length - 1] = temp;
        return number;
    }

    public static void main(String[] args) {
        SwitchArray switchArray = new SwitchArray();
        int[] arrayNumber = new int[] {1, 4, 5, 6, 8};
        switchArray.swapBorder(arrayNumber);
        for (int value: arrayNumber) {
            System.out.print(value + " ");
        }
    }
}
