package ru.job4j.collection_lite.collection;

import java.util.List;

/**
 * Класс реализует конвертацию листа в двумерный массив
 *
 * @author Денис Висков
 * @version 1.0
 * @since 29.12.2019
 */
public class ConvertList2Array {
    /**
     * Метод реализует преобразование листа в двумерный массив
     *
     * @param list  - лист
     * @param cells - группировка
     * @return - массив
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell < cells) {
                array[row][cell] = num;
                cell++;
            }
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
