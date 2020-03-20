package ru.job4j.base_syntax.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void maxFirstTest() {
        int out = ru.job4j.condition.SqMax.max(4, 3, 2, 1);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxSecondTest() {
        int out = ru.job4j.condition.SqMax.max(1, 4, 3, 2);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxThirdTest() {
        int out = ru.job4j.condition.SqMax.max(1, 2, 4, 3);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxFourTest() {
        int out = ru.job4j.condition.SqMax.max(1, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void allParametersAreEqualTest() {
        int out = ru.job4j.condition.SqMax.max(4, 4, 4, 4);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }
}
