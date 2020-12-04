package ru.job4j.array;

public class Defragment {
    public String[] compress(String[] arrayWord) {
        SwitchArray switchArray = new SwitchArray();
        for (int i = 0; i < arrayWord.length; i++) {
            if (arrayWord[i] == null) {
                int takeNull = i; //здесь нашли null
                for (int j = takeNull; j < arrayWord.length; j++) {
                    if (arrayWord[j] != null) {
                        switchArray.swapToString(arrayWord, takeNull, j);
                        break;
                    }
                }
            }
        }
        return arrayWord;
    }

}

