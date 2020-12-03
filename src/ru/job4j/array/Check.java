package ru.job4j.array;

public class Check {
    public boolean agreeChoice(boolean[] array) {
        boolean result = true;
        for (boolean value : array) {
            if (value != result) {
                result = false;
                break;
            }
        }
        return result;
    }
}
