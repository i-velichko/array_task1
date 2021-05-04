package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;

public class ArrayValidator {

    public static boolean isCorrectArray(DataArray dataArray) {
        if (dataArray != null && dataArray.getArray() != null) {
            return dataArray.getArray().length != 0;
        } else {
            return false;
        }
    }
}
