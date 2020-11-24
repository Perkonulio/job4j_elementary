package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void hiAnswer() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.logicAnswer("Привет, Бот."), is("Привет, умник."));
    }

    @Test
    public void byeAnswer() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.logicAnswer("Пока, Бот."), is("До скорой встречи"));
    }

    @Test
    public void anythingAnswer() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.logicAnswer("Представтесь."),
                is("Это ставит меня в тупик. Задайте другой вопрос."));
    }

}