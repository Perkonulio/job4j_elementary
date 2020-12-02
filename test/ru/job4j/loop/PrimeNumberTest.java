package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void primeCalc() {
        PrimeNumber primeNumber = new PrimeNumber();
        assertThat(primeNumber.primeCalc(5), is(3));
    }

    @Test
    public void when11() {
        PrimeNumber primeNumber = new PrimeNumber();
        assertThat(primeNumber.primeCalc(11), is(5));
    }

}