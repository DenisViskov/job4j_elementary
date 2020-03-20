package ru.job4j.collection_lite.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Класс реализующий конвертацию заказов в карту
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class OrderConvert {
    /**
     * Метод реализует функционал конвертации из заказов в карту
     *
     * @param orders - заказы
     * @return - карта
     */
    public static HashMap<String, ru.job4j.collection.Order> process(List<ru.job4j.collection.Order> orders) {
        HashMap<String, ru.job4j.collection.Order> map = new HashMap<>();
        for (ru.job4j.collection.Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
