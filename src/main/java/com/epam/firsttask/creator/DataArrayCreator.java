package com.epam.firsttask.creator;

import com.epam.firsttask.entity.DataArray;

public class DataArrayCreator {

    public DataArray fillTheArrayWithData(int[] numbers) {

        DataArray dataArray = new DataArray(numbers);

        return dataArray;

    }
}
