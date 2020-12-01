package ru.job4j.loop;

public class Counter {
    public int sum(int start, int finish) {
        int summary = 0;
        for (int i = start; i <= finish; i++) {
            summary += i;
        }
        return summary;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.sum(0, 2));
        System.out.println(counter.sum(3, 5));
        System.out.println(counter.sum(1, 4));
    }
}
