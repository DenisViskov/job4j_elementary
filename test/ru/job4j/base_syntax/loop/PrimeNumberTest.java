package ru.job4j.base_syntax.loop;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        ru.job4j.loop.PrimeNumber prime = new ru.job4j.loop.PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        ru.job4j.loop.PrimeNumber prime = new ru.job4j.loop.PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        ru.job4j.loop.PrimeNumber prime = new ru.job4j.loop.PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }
}
