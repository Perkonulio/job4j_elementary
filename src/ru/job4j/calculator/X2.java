package ru.job4j.calculator;

public class X2 {
    public int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        X2 x2 = new X2();
        int result = x2.calc(a, b, c, x);
        System.out.println(result);
    }
}
