package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void monthSlavery() {
        Mortgage mortgage = new Mortgage();
        assertThat(mortgage.monthSlavery(100, 70, 0.5), is(4));
    }
}