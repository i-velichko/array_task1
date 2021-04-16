package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.service.ArraySortService;
import com.epam.firsttask.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortServiceImpl implements ArraySortService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] bubbleArraySort(DataArray dataArray) throws DataArrayException {
        if (ArrayValidator.isCorrectArray(dataArray)) {
            int[] arrayForSort = Arrays.copyOf(dataArray.getArray(), dataArray.getArray().length);
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
            LOGGER.info("Bubble array sort use. Array after sorting - " + Arrays.toString(arrayForSort));
            return arrayForSort;
        } else {
            throw new DataArrayException("Array not valid for this operation.");
        }
    }

    @Override
    public int[] insertionArraySort(DataArray dataArray) throws DataArrayException {
        if (ArrayValidator.isCorrectArray(dataArray)) {
            int[] arrayForSort = Arrays.copyOf(dataArray.getArray(), dataArray.getArray().length);
            for (int left = 0; left < arrayForSort.length; left++) {
                int value = arrayForSort[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < arrayForSort[i]) {
                        arrayForSort[i + 1] = arrayForSort[i];
                    } else {
                        break;
                    }
                }
                arrayForSort[i + 1] = value;
            }
            LOGGER.info("Insertion array sort use. Array after sorting - " + Arrays.toString(arrayForSort));
            return arrayForSort;
        } else {
            throw new DataArrayException("Array not valid for this operation.");
        }
    }

    @Override
    public int[] selectionArraySort(DataArray dataArray) throws DataArrayException {
        if (ArrayValidator.isCorrectArray(dataArray)) {
            int[] arrayForSort = Arrays.copyOf(dataArray.getArray(), dataArray.getArray().length);
            for (int i = 0; i < arrayForSort.length; i++) {
                int min = arrayForSort[i];
                int minId = i;
                for (int j = i + 1; j < arrayForSort.length; j++) {
                    if (arrayForSort[j] < min) {
                        min = arrayForSort[j];
                        minId = j;
                    }
                }
                int temp = arrayForSort[i];
                arrayForSort[i] = min;
                arrayForSort[minId] = temp;
            }
            LOGGER.info("Selection array sort use. Array after sorting - " + Arrays.toString(arrayForSort));
            return arrayForSort;
        } else {
            throw new DataArrayException("Array not valid for this operation.");
        }
    }

    @Override
    public int[] intStreamArraySort(DataArray dataArray) throws DataArrayException {
        if (ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.info("Array before sorting - " + Arrays.toString(dataArray.getArray()));
            int[] ints = IntStream.of(dataArray.getArray())
                    .sorted().toArray();
            LOGGER.info("Use intStream method. Array after sorting - " + Arrays.toString(ints));
            return ints;
        } else {
            throw new DataArrayException("Array not valid for this operation.");
        }
    }
}
