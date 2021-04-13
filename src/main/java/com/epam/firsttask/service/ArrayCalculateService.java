package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;

public interface ArrayCalculateService {

    public int findMinValue(DataArray dataArray);

    public int findMaxValue(DataArray dataArray);

    public int sumValues(DataArray dataArray);

    public int findAverageValue(DataArray dataArray);

    public int findPositiveElementsNumber(DataArray dataArray);

    public int findNegativeElementsNumber(DataArray dataArray);

    public int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray);

}
