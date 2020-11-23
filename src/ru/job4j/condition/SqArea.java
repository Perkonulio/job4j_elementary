package ru.job4j.condition;

public class SqArea {
    public double square(double per, double k) {
        double high = per / (2 * (k + 1));
        double length = high * k;
        return length * high;

    }

    public static void main(String[] args) {
        SqArea sqArea = new SqArea();
        int p = 6;
        int k = 2;
        System.out.println("p = " + p + " k = " + k + " area = " + sqArea.square(p, k));
    }
}
