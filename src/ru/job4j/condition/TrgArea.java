package ru.job4j.condition;

public class TrgArea {
    public double area(double a, double b, double c) {
        double halfMeter = (a + b + c) / 2;
        return Math.sqrt(halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c));
    }

    public static void main(String[] args) {
        TrgArea trgArea = new TrgArea();
        System.out.println(trgArea.area(3, 5, 4));
    }
}
