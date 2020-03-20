package ru.job4j.base_syntax.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                ru.job4j.array.MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                ru.job4j.array.MinDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                ru.job4j.array.MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }
}
