package ru.job4j.loop;

public class LoopFor {
    public void loopFor() {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        LoopFor loopFor = new LoopFor();
        loopFor.loopFor();
    }
}
