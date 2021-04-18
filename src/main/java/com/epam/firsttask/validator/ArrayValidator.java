package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;

public class ArrayValidator {

    public static boolean isCorrectArray(DataArray dataArray) {
        if (dataArray == null) {
            return false;
        } else if (dataArray.getArray() == null) {
            return false;
        } else return dataArray.getArray().length != 0;
    }

}
