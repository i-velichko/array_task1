package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {

    @Override
    public int findMinValue(DataArray dataArray) {
        int arraySize = dataArray.getArray().length;
        int minValue = dataArray.getArray()[0];

        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] < minValue) {
                minValue = dataArray.getArray()[i];
            }
        }

        return minValue;

    }

    @Override
    public int findMaxValue(DataArray dataArray) {
        int arraySize = dataArray.getArray().length;
        int maxValue = dataArray.getArray()[0];

        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] > maxValue) {
                maxValue = dataArray.getArray()[i];
            }
        }

        return maxValue;

    }

    @Override
    public int sumValues(DataArray dataArray) {
        int elementsArraySum = 0;
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize; i++) {
            elementsArraySum = elementsArraySum + dataArray.getArray()[i];
        }
        return elementsArraySum;
    }

    @Override
    public int findAverageValue(DataArray dataArray) {
        int elementsArraySum = 0;
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize; i++) {
            elementsArraySum = elementsArraySum + dataArray.getArray()[i];
        }
        int averageValue = elementsArraySum / dataArray.getArray().length;
        return averageValue;
    }

    @Override
    public int findPositiveElementsNumber(DataArray dataArray) {
        int positiveNumber = 0;
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] > 0)
                positiveNumber++;
        }
        return positiveNumber;
    }

    @Override
    public int findNegativeElementsNumber(DataArray dataArray) {
        int negativeNumber = 0;
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] < 0)
                negativeNumber++;
        }
        return negativeNumber;
    }

    @Override
    public int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray) {
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize; i++) {
            dataArray.getArray()[i] = dataArray.getArray()[i] * -1;
        }
        return dataArray.getArray();
    }
}
