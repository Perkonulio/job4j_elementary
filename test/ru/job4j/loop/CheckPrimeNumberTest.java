package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void check() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        assertThat(checkPrimeNumber.check(11), is(true));
    }
}