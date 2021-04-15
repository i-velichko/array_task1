package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;

public interface ArrayCalculateService {

    int findMinValue(DataArray dataArray);

    int findMaxValue(DataArray dataArray) throws DataArrayException;

    int sumValues(DataArray dataArray);

    double findAverageValue(DataArray dataArray) throws DataArrayException;

    int findPositiveElementsNumber(DataArray dataArray);

    int findNegativeElementsNumber(DataArray dataArray);

    int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray);

}
