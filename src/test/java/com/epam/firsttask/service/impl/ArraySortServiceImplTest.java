package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {
    private final static int[] ARRAY_BEFORE_SORTING = {3, 5, 12, 44, 2, -35, 66, 1, 6, 87};
    private final static int[] EXPECTED_ARRAY_AFTER_SORTING = {-35, 1, 2, 3, 5, 6, 12, 44, 66, 87};
    private static ArraySortServiceImpl arraySortService;
    DataArray dataArray = new DataArray();

    @BeforeClass
    public void setUp() {
        arraySortService = new ArraySortServiceImpl();
        dataArray.setArray(ARRAY_BEFORE_SORTING);
    }

    @Test
    public void testBubbleSortTrueResult() {
        int[] actualArrayAfterSorting = arraySortService.bubbleArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test
    public void testInsertionSortTrueResult() {
        int[] actualArrayAfterSorting = arraySortService.insertionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test
    public void testSelectionSortTrueResult() {
        int[] actualArrayAfterSorting = arraySortService.selectionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }
}