package ru.job4j.condition;

public class Max {
    public int result(int a, int b) {
        int max = a >= b ? a : b;
        return max;
    }

    public int result(int a, int b, int c) {
        return result(result(a, b), c);
    }

    public int result(int a, int b, int c, int d) {
        return result(result(a, b), result(c, d));
    }
}
