package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {
    @Override
    public void bubbleSort(DataArray dataArray) {
        int[] beforeSort = dataArray.getArray();
        int n = beforeSort.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (beforeSort[j - 1] > beforeSort[j]) {
                    //swap elements
                    temp = beforeSort[j - 1];
                    beforeSort[j - 1] = beforeSort[j];
                    beforeSort[j] = temp;
                }

            }
        }
    }
}
