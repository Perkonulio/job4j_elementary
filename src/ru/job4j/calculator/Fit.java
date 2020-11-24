package ru.job4j.calculator;

public class Fit {
    public double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        Fit fit = new Fit();
        short height = 180;
        System.out.println("При росте в " + height + " см, "
                + " идеальный вес для мужчины будет " + fit.manWeight(height) + " кг");

        System.out.println("При росте в " + height + " см, "
                + " идеальный вес для женщины будет " + fit.womanWeight(height) + " кг");
    }
}
