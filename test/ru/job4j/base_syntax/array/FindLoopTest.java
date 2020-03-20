package ru.job4j.base_syntax.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        ru.job4j.array.FindLoop find = new ru.job4j.array.FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasnt6ThenMinusOne() {
        ru.job4j.array.FindLoop find = new ru.job4j.array.FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = ru.job4j.array.FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenElementNotFound() {
        int[] input = new int[]{5, 2, 10, 3, 4, 5, 8};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = ru.job4j.array.FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFive() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = ru.job4j.array.FindLoop.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThree() {
        int[] input = new int[]{3, 4, 1};
        int[] result = ru.job4j.array.FindLoop.sort(input);
        int[] expect = new int[]{1, 3, 4};
        assertThat(result, is(expect));
    }
}
