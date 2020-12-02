package ru.job4j.loop;

public class Counter {
    public int sum(int start, int finish) {
        int summary = 0;
        for (int i = start; i <= finish; i++) {
            summary += i;
        }
        return summary;
    }

    public int sumByEven(int start, int finish) {
        int summary = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
               summary += i;
            }
        }
        return summary;
    }
}
