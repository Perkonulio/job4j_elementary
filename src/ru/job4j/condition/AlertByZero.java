package ru.job4j.condition;

public class AlertByZero {

    public void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }

    public static void main(String[] args) {
        AlertByZero alertByZero = new AlertByZero();
        alertByZero.possibleDiv(-1);
    }
}
