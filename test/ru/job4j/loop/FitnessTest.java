package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void monthProgress1() {
        Fitness fitness = new Fitness();
        assertThat(fitness.monthProgress(50, 100), is(2));
    }

    @Test
    public void monthProgress2() {
        Fitness fitness = new Fitness();
        assertThat(fitness.monthProgress(100, 80), is(0));
    }

    @Test
    public void monthProgress3() {
        Fitness fitness = new Fitness();
        assertThat(fitness.monthProgress(90, 100), is(1));
    }
}