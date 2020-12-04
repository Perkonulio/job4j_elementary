package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void checkEnding1() {
        EndsWith end = new EndsWith();
        char[] firstWord = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] secondWord = new char[] {'l', 'o'};
        assertThat(end.checkEnding(firstWord, secondWord), is(true));
    }

    @Test
    public void checkEnding2() {
        EndsWith end = new EndsWith();
        char[] firstWord = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] secondWord = new char[] {'a', 'o'};
        assertThat(end.checkEnding(firstWord, secondWord), is(false));
    }
}