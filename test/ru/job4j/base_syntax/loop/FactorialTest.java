package ru.job4j.base_syntax.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int out = new ru.job4j.loop.Factorial().calc(5);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int out = new ru.job4j.loop.Factorial().calc(0);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}
