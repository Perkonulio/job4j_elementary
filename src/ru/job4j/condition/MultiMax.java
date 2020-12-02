package ru.job4j.condition;

public class MultiMax {
    public int returnMax(int firstNum, int secondNum, int thirdNum) {
        int averageMax;
        if (firstNum >= secondNum) {
            averageMax = firstNum;
        } else {
            averageMax = secondNum;
        }
        if (averageMax <= thirdNum) {
            averageMax = thirdNum;
        } else {
            return averageMax;
        }
        return averageMax;
    }

    public static void main(String[] args) {
        MultiMax multiMax = new MultiMax();
        System.out.println(multiMax.returnMax(10, 9, 10));
    }
}
