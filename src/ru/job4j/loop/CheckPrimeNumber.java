package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int number) {
        boolean prime = false;
        if (number == 1) {
            prime = false;
        } else if (number == 2) {
            prime = true;
        } else if (number == 3) {
            prime = true;
        } else if (number > 2) {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
        return prime;
    }
}
