package ru.job4j.array;

public class EndsWith {
    public boolean checkEnding(char[] firstWord, char[] secondWord) {
        boolean result = true;
        for (int i = 1; i <= secondWord.length; i++) {
            if (firstWord[firstWord.length - i] != secondWord[secondWord.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
