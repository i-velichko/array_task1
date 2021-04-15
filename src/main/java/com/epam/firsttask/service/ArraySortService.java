package com.epam.firsttask.service;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;

public interface ArraySortService {

    int[] bubbleArraySort(DataArray dataArray) throws DataArrayException;

    int[] insertionArraySort(DataArray dataArray) throws DataArrayException;

    int[] selectionArraySort(DataArray dataArray) throws DataArrayException;

    int[] intStreamArraySort(DataArray dataArray) throws DataArrayException;
}
