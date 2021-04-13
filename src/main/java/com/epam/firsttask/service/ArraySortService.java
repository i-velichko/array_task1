package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;

public interface ArraySortService {

    public int[] bubbleArraySort(DataArray dataArray);

    public int[] insertionArraySort(DataArray dataArray);

    public int[] selectionArraySort(DataArray dataArray);
}
