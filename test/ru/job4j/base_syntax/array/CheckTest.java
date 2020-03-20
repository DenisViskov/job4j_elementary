package ru.job4j.base_syntax.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        ru.job4j.array.Check check = new ru.job4j.array.Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataOddNotMonoByTrueThenFalse() {
        ru.job4j.array.Check check = new ru.job4j.array.Check();
        boolean[] input = new boolean[]{true, false, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}