package ru.job4j.base_syntax.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        ru.job4j.condition.MultiMax check = new ru.job4j.condition.MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        ru.job4j.condition.MultiMax check = new ru.job4j.condition.MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        ru.job4j.condition.MultiMax check = new ru.job4j.condition.MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenAllAreEquel() {
        ru.job4j.condition.MultiMax check = new ru.job4j.condition.MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}
