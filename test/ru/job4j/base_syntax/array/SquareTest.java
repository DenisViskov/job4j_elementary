package ru.job4j.base_syntax.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        ru.job4j.array.Square square = new ru.job4j.array.Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5() {
        int bound = 5;
        ru.job4j.array.Square square = new ru.job4j.array.Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound10() {
        int bound = 10;
        ru.job4j.array.Square square = new ru.job4j.array.Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        assertThat(rst, is(expect));
    }
}