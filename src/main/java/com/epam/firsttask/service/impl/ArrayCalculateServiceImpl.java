package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.service.ArrayCalculateService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Optional;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public int findMinValue(DataArray dataArray) {
        return Optional.ofNullable(dataArray)
                .map(DataArray::getArray)
                .map(ints -> {
                    int[] array = dataArray.getArray();
                    int minValue = array[0];

                    for (int j : array) {
                        if (j < minValue) {
                            minValue = j;
                        }
                    }
                    LOGGER.info("Min element value in this array = " + minValue);
                    return minValue;
                }).orElseThrow();
    }

    @Override
    public int findMaxValue(DataArray dataArray) throws DataArrayException {
        nullChek(dataArray);
        int[] array = dataArray.getArray();
        int maxValue = array[0];

        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        LOGGER.info("Max element value in this array = " + maxValue);
        return maxValue;
    }

    @Override
    public int sumValues(DataArray dataArray) {
        int[] array = dataArray.getArray();
        int elementsArraySum = 0;
        for (int j : array) {
            elementsArraySum = elementsArraySum + j;
        }
        LOGGER.info("Sum  array elements = " + elementsArraySum);
        return elementsArraySum;
    }

    @Override
    public double findAverageValue(DataArray dataArray) {
        int[] array = dataArray.getArray();
        double elementsArraySum = 0;
        for (double j : array) {
            elementsArraySum = elementsArraySum + j;
        }
        double averageValue = elementsArraySum / array.length;
        LOGGER.info("Average  array elements value  = " + averageValue);
        return averageValue;
    }

    @Override
    public int findPositiveElementsNumber(DataArray dataArray) {
        int[] array = dataArray.getArray();
        int positiveElementsNumber = 0;
        for (int j : array) {
            if (j > 0) {
                positiveElementsNumber++;
            }
        }
        LOGGER.info("Number of positive array elements = " + positiveElementsNumber);
        return positiveElementsNumber;
    }

    @Override
    public int findNegativeElementsNumber(DataArray dataArray) {
        int[] array = dataArray.getArray();
        int negativeElementsNumber = 0;
        for (int j : array) {
            if (j < 0)
                negativeElementsNumber++;
        }
        LOGGER.info("Number of negative array elements =" + negativeElementsNumber);
        return negativeElementsNumber;
    }

    @Override
    public int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray) {
        int[] array = dataArray.getArray();
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            array[i] = array[i] * -1;
        }
        LOGGER.info("Replaced with opposite signs array elements is - " + Arrays.toString(array));
        return array;
    }

    private void nullChek(DataArray dataArray) throws DataArrayException {
        if (dataArray == null || dataArray.getArray() == null) {
            throw new DataArrayException("Argument can not be null");
        }
    }
}
