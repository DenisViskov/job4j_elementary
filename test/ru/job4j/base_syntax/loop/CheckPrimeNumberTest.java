package ru.job4j.base_syntax.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        ru.job4j.loop.CheckPrimeNumber prime = new ru.job4j.loop.CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        ru.job4j.loop.CheckPrimeNumber prime = new ru.job4j.loop.CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }
}
