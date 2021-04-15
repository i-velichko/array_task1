package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;

public interface ArrayCalculateService {

    int findMinValue(DataArray dataArray) throws DataArrayException;

    int findMaxValue(DataArray dataArray) throws DataArrayException;

    int sumValues(DataArray dataArray) throws DataArrayException;

    double findAverageValue(DataArray dataArray) throws DataArrayException;

    int findPositiveElementsNumber(DataArray dataArray) throws DataArrayException;

    int findNegativeElementsNumber(DataArray dataArray) throws DataArrayException;

    int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray) throws DataArrayException;

}
