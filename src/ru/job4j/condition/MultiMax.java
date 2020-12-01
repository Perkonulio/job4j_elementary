package ru.job4j.condition;

public class MultiMax {
    public int returnMax(int firstNum, int secondNum, int thirdNum) {
        int averageMax;
        int max;
        if (firstNum >= secondNum) {
            averageMax = firstNum;
        } else {
            averageMax = secondNum;
        }
        if (averageMax >= thirdNum) {
            max = averageMax;
        } else {
            max = thirdNum;
        }
        return max;
    }

    public static void main(String[] args) {
        MultiMax multiMax = new MultiMax();
        System.out.println(multiMax.returnMax(23, 2, 2));
    }
}
