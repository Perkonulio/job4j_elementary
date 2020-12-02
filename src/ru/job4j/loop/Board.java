package ru.job4j.loop;

public class Board {
    public void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                if ((i + k) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
