package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;

public class ArrayValidator {

    public static boolean isCorrectArray(DataArray dataArray) {
        boolean result = false;
        if (!(dataArray == null) || !(dataArray.getArray().length == 0)) {
            result = true;
        }
        return result;
    }
}
