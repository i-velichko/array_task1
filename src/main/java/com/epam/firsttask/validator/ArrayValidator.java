package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;

public class ArrayValidator {

    public static boolean isCorrectArray(DataArray dataArray) {
        return dataArray != null && dataArray.getArray().length != 0;
    }
}
