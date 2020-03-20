package ru.job4j.base_syntax.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        ru.job4j.loop.Fitness fit = new ru.job4j.loop.Fitness();
        int month = fit.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        ru.job4j.loop.Fitness fit = new ru.job4j.loop.Fitness();
        int month = fit.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        ru.job4j.loop.Fitness fit = new ru.job4j.loop.Fitness();
        int month = fit.calc(50, 90);
        assertThat(month, is(2));
    }
}
