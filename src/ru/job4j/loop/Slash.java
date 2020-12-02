package ru.job4j.loop;

public class Slash {
    public void draw(int size) {
        boolean left = false;
        boolean right = false;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    left = true;
                } else if (i == size / 2) {
                    right = false;
                } else if (j != i && j == size - i - 1) {
                    right = true;
                }
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