package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startWith() {
        ArrayChar arrayChar = new ArrayChar();
        char[] full = {'H', 'e', 'l', 'l', 'o'};
        char[] part = {'H', 'e'};
        assertThat(arrayChar.startWith(full, part), is(true));
    }
}