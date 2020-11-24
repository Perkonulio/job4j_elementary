package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void result1() {
        Triangle triangle = new Triangle();
        boolean result = triangle.result(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void result2() {
        Triangle triangle = new Triangle();
        boolean result = triangle.result(1, 1, 3);
        assertThat(result, is(false));
    }
}