package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorioForThree() {
        Factorial factorial = new Factorial();
        int expect = 6;
        assertThat(factorial.factorio(3), is(expect));
    }

    @Test
    public void factorioForFive() {
        Factorial factorial = new Factorial();
        int expect = 120;
        assertThat(factorial.factorio(5), is(expect));
    }
}