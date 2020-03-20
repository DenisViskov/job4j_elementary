package ru.job4j.collection_lite.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<ru.job4j.collection.Order> orders = new ArrayList<>();
        orders.add(new ru.job4j.collection.Order("3sfe", "Dress"));
        HashMap<String, ru.job4j.collection.Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new ru.job4j.collection.Order("3sfe", "Dress")));
    }
}
