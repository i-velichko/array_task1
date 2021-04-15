package com.epam.firsttask.creator;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;

import java.util.Arrays;

public class DataArrayCreator {

    public DataArray fillTheArrayWithData(int[] numbers) throws DataArrayException {

        if (Arrays.equals(numbers, new int[0])){
            throw new DataArrayException("Array is empty");
        }

        DataArray dataArray = new DataArray(numbers);

        return dataArray;

    }
}

