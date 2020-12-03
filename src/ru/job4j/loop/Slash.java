package ru.job4j.loop;

public class Slash {
    public void draw(int size) {
        boolean left = false;
        boolean right = false;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                left = j == i;
                right = i == size / 2;
                right = j == size - i - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else  {
                    System.out.print(" ");
                }
                left = false;
                right = false;
            }

            System.out.println();
        }
    }
}
//