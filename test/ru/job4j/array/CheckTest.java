package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void agreeChoice1() {
        Check check = new Check();
        boolean[] inputData = new boolean[] {true, false, true, true};
        assertThat(check.agreeChoice(inputData), is(false));
    }

    @Test
    public void agreeChoice2() {
        Check check = new Check();
        boolean[] inputData = new boolean[] {true, false, false, false};
        assertThat(check.agreeChoice(inputData), is(true));
    }
}