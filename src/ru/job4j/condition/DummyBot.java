package ru.job4j.condition;

public class DummyBot {
    public String logicAnswer(String words) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (words.equals("Привет, Бот.")) {
            rsl = "Привет, умник.";
        } else if (words.equals("Пока, Бот.")) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        DummyBot dummyBot = new DummyBot();
        System.out.println(dummyBot.logicAnswer("Привет, Бот."));
    }
}
