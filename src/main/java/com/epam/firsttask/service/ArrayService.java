package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;

public class ArrayService {

    public int minValue(DataArray dataArray) {
        int arraySize = dataArray.getArray().length;
        int minValue = dataArray.getArray()[0];

        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] < minValue) {
                minValue = dataArray.getArray()[i];
            }
        }

        return minValue;

    }

    public int maxValue(DataArray dataArray) {
        int arraySize = dataArray.getArray().length;
        int maxValue = dataArray.getArray()[0];

        for (int i = 0; i < arraySize; i++) {
            if (dataArray.getArray()[i] > maxValue) {
                maxValue = dataArray.getArray()[i];
            }
        }

        return maxValue;

    }

    public int sumValues(DataArray dataArray){
        int arraySize = dataArray.getArray().length;
        for (int i = 0; i < arraySize ; i++) {

        }
        return 0;
    }
}
