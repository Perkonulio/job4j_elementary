package ru.job4j.loop;

public class Mortgage {
    public int monthSlavery(int credit, int salary, double percent) {
        int year = 0;
        double remains = credit;
        while (remains > 0) {
            remains = remains + remains * percent;
            remains = remains - salary;
            year++;
        }
        return year;
    }
}
