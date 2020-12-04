package ru.job4j.array;

public class EndsWith {
    public boolean checkEnding(char[] firstWord, char[] secondWord) {
        boolean result = false;
        for (int i = 1; i <= secondWord.length; i++) {
            if (firstWord[firstWord.length - i] == secondWord[secondWord.length - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
