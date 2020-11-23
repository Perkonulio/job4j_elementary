package ru.job4j.converter;

public class Converter {
    public float rublesToDollars(float rubles) {
        return rubles / 60;
    }

    public float rublesToEuros(float rubles) {
        return rubles / 70;
    }

    public static void main(String[] args) {
        int firstRubles = 215;
        Converter converter = new Converter();
        float resultDollars = converter.rublesToDollars(firstRubles);
        float resultEuros = converter.rublesToEuros(firstRubles);
        System.out.println(firstRubles + " rubles are " + resultDollars + " dollars");
        System.out.println(firstRubles + " rubles are " + resultEuros + " euros");
    }
}
