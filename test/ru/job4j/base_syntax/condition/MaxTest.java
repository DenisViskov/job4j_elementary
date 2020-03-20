package ru.job4j.base_syntax.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxIncludesTwoPosition() {
        int result = ru.job4j.condition.Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxIncludesTreePosition() {
        int result = ru.job4j.condition.Max.max(3, 1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxIncludesFourPosition() {
        int result = ru.job4j.condition.Max.max(3, 3, 5, 7);
        assertThat(result, is(7));
    }

}