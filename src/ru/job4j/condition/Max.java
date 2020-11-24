package ru.job4j.condition;

public class Max {
    public int result(int a, int b) {
        int max = a >= b ? a : b;
        return max;
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(maximum.result(5, 6));
    }
}
