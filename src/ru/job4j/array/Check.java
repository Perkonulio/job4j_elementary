package ru.job4j.array;

public class Check {
    public boolean agreeChoice(boolean[] array) {
        boolean result = false;
        for (boolean value : array) {
            if (value != array[0]) {
                result = false;
                break;
            } else {
                result = true;
            }

        }
        return result;
    }
}
