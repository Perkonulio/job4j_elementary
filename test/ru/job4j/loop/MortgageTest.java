package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void monthSlavery() {
        Mortgage mortgage = new Mortgage();
        assertThat(mortgage.monthSlavery(100, 70, 50), is(4));
    }

    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        assertThat(mortgage.monthSlavery(1000, 1200, 1), is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        assertThat(mortgage.monthSlavery(100, 120, 50), is(2));
    }
}