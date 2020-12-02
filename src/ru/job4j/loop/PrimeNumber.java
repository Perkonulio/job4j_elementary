package ru.job4j.loop;

public class PrimeNumber {
    CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

    public int primeCalc(int number) {
        int sumPrimeNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (checkPrimeNumber.check(i)) {
                sumPrimeNumber++;
            }
        }
        return sumPrimeNumber;
    }
}
