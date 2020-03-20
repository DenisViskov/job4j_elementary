package ru.job4j.base_syntax.array;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        ru.job4j.array.Merge algo = new ru.job4j.array.Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        ru.job4j.array.Merge algo = new ru.job4j.array.Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        ru.job4j.array.Merge algo = new ru.job4j.array.Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        ru.job4j.array.Merge algo = new ru.job4j.array.Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        ru.job4j.array.Merge algo = new ru.job4j.array.Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}
