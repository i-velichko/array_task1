package com.epam.firsttask.entity;

import java.util.Arrays;

public class DataArray {
    private int[] array;

    public DataArray() {
    }

    public DataArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataArray dataArray = (DataArray) o;
        return Arrays.equals(array, dataArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "DataArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

// 1. Читаем файл где одна строка это символы с разделительем, потом этот разделитель сплитом отмечаю
// 2. Данные файла идут в валидатор, дальше тру или фолс.
// 3. Отправляет результаты  в парсер, парсер перегоняет их в инты и отправляет массив интов креатору
// 4. Креатор присваивает этот массив с помощью сеттера основному
// 5. Дальше идет сервис

