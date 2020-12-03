package ru.job4j.loop;

public class Slash {
    public void draw(int size) {
        boolean left;
        boolean right;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                left = j == i;
                right = j == size - i - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else  {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
//