package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        Defragment defragment = new Defragment();
        String[] input = {null, "I"};
        String[] compressed = defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notFirstNull() {
        Defragment defragment = new Defragment();
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        Defragment defragment = new Defragment();
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNull() {
        Defragment defragment = new Defragment();
        String[] input = {null, null, null};
        String[] compressed = defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull() {
        Defragment defragment = new Defragment();
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}