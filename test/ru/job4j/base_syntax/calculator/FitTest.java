package ru.job4j.base_syntax.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 180;
        double expected = 92;
        double out = ru.job4j.calculator.Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 165;
        double expected = 63.24;
        double out = ru.job4j.calculator.Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}