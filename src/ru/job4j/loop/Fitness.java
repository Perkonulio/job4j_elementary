package ru.job4j.loop;

public class Fitness {
    public int monthProgress(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            nik = nik * 2;
            ivan = ivan * 3;
            month++;
        }
        return month;
    }
}
