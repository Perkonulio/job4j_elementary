package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int firstRubles = 215;
        float resultDollars = converter.rublesToDollars(firstRubles);
        float resultEuros = converter.rublesToEuros(firstRubles);
        System.out.println(firstRubles + " rubles are " + resultDollars + " dollars");
        System.out.println(firstRubles + " rubles are " + resultEuros + " euros");
    }
    public float rublesToDollars(float rubles){
        return rubles/60;
    }
    public float rublesToEuros(float rubles){
        return rubles/70;
    }
}
