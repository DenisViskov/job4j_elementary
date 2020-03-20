package ru.job4j.collection_lite.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void sortAscTest() {
        List<String> input = Arrays.asList("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2");
        List<String> expect = Arrays.asList("K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2");
        List<String> out = ru.job4j.collection.Departments.sortAsc(input);
        assertThat(out, is(expect));
    }

    @Test
    public void sortDescTest() {
        List<String> input = Arrays.asList("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2");
        List<String> expect = Arrays.asList("K2",
                "K2/SK1",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1",
                "K1",
                "K1/SK2",
                "K1/SK1",
                "K1/SK1/SSK2",
                "K1/SK1/SSK1");
        List<String> out = ru.job4j.collection.Departments.sortDesc(input);
        assertThat(out, is(expect));
    }
}