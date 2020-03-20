package ru.job4j.base_syntax.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void period() {
        Point first = new Point(2, 0);
        Point second = new Point(5, 0);
        Point third = new Point(4, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.period(first.distance(second), first.distance(third), second.distance(third));
        assertThat(result, is(3.0));
    }

    @Test
    public void whenTriangeIsTruthArea() {
        Point first = new Point(3, 0);
        Point second = new Point(7, 50);
        Point third = new Point(5, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(50.0));
    }

    @Test
    public void whenTriangeIsNotTrueArea() {
        Point first = new Point(2, 0);
        Point second = new Point(5, 0);
        Point third = new Point(4, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(-1.0));
    }

}