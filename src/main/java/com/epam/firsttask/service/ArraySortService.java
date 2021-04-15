package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;

public interface ArraySortService {

    int[] bubbleArraySort(DataArray dataArray);

    int[] insertionArraySort(DataArray dataArray);

    int[] selectionArraySort(DataArray dataArray);

    int[] intStreamArraySort(DataArray dataArray);
}
