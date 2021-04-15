package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortServiceImpl implements ArraySortService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] intStreamArraySort(DataArray dataArray) {
        LOGGER.info("Array before sorting - " + Arrays.toString(dataArray.getArray()));
        int[] ints = IntStream.of(dataArray.getArray())
                .sorted().toArray();
        LOGGER.info("Use intStream method. Array after sorting - " + Arrays.toString(ints));
        return ints;
    }

    @Override
    public int[] bubbleArraySort(DataArray dataArray) {
        int[] arrayForSort = dataArray.getArray();
        int n = arrayForSort.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arrayForSort[j - 1] > arrayForSort[j]) {
                    temp = arrayForSort[j - 1];
                    arrayForSort[j - 1] = arrayForSort[j];
                    arrayForSort[j] = temp;
                }

            }
        }
        return arrayForSort;
    }

    @Override
    public int[] insertionArraySort(DataArray dataArray) {
        for (int left = 0; left < dataArray.getArray().length; left++) {
            int value = dataArray.getArray()[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < dataArray.getArray()[i]) {
                    dataArray.getArray()[i + 1] = dataArray.getArray()[i];
                } else {
                    break;
                }
            }
            dataArray.getArray()[i + 1] = value;
        }
        return dataArray.getArray();
    }

    @Override
    public int[] selectionArraySort(DataArray dataArray) {

        for (int i = 0; i < dataArray.getArray().length; i++) {
            int min = dataArray.getArray()[i];
            int minId = i;
            for (int j = i + 1; j < dataArray.getArray().length; j++) {
                if (dataArray.getArray()[j] < min) {
                    min = dataArray.getArray()[j];
                    minId = j;
                }
            }
            int temp = dataArray.getArray()[i];
            dataArray.getArray()[i] = min;
            dataArray.getArray()[minId] = temp;
        }
        return dataArray.getArray();
    }
}
