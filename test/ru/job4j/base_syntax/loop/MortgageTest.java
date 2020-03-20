package ru.job4j.base_syntax.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        ru.job4j.loop.Mortgage mortgage = new ru.job4j.loop.Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        ru.job4j.loop.Mortgage mortgage = new ru.job4j.loop.Mortgage();
        int year = mortgage.year(100, 70, 50);
        assertThat(year, is(4));
    }
}
