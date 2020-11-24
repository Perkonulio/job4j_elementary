package ru.job4j.converter;

public class Converter {
    public int rublesToDollars(int rubles) {
        return rubles / 60;
    }

    public int rublesToEuros(int rubles) {
        return rubles / 70;
    }

    public static void main(String[] args) {
        int firstRubles = 420;
        float dollarsExpect = 7;
        float eurosExpect = 6;
        Converter converter = new Converter();
        int resultDollars = converter.rublesToDollars(firstRubles);
        int resultEuros = converter.rublesToEuros(firstRubles);
        boolean passedDollars = dollarsExpect == converter.rublesToDollars(firstRubles);
        boolean passedEuros = eurosExpect == converter.rublesToEuros(firstRubles);
        System.out.println(firstRubles + " rubles are " + resultDollars + " dollars");
        System.out.println("Test result:" + passedDollars);
        System.out.println(firstRubles + " rubles are " + resultEuros + " euros");
        System.out.println("Test result:" + passedEuros);
    }
}
