package ru.job4j.array;

public class ArrayChar {
    public boolean startWith(char[] full, char[] part) {
        boolean result = true;
        for (int i = 0; i < part.length; i++) {
            if (full[i] != part[i]) {
               result = false;
               break;
            }
        }
        return result;
    }
}
