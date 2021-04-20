package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraySortServiceImplTest {
    private final static int[] ARRAY_BEFORE_SORTING = {3, 5, 12, 44, 2, -35, 66, 1, 6, 87};
    private final static int[] EXPECTED_ARRAY_AFTER_SORTING = {-35, 1, 2, 3, 5, 6, 12, 44, 66, 87};
    private final ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();
    private DataArray dataArray;

    @BeforeMethod
    public void setUp() {
        dataArray = new DataArray();
        dataArray.setArray(Arrays.copyOf(ARRAY_BEFORE_SORTING, ARRAY_BEFORE_SORTING.length));
    }

    @Test
    public void testBubbleSortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.bubbleArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testBubbleSortWhenObjectNull() throws DataArrayException {
        arraySortService.bubbleArraySort(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testBubbleSortWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arraySortService.bubbleArraySort(dataArray);
    }

    @Test
    public void testInsertionSortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.insertionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testInsertionSortWhenObjectNull() throws DataArrayException {
        arraySortService.insertionArraySort(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testInsertionSortWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arraySortService.insertionArraySort(dataArray);
    }

    @Test
    public void testSelectionSortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.selectionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testSelectionSortWhenObjectNull() throws DataArrayException {
        arraySortService.selectionArraySort(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testSelectionSortWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arraySortService.selectionArraySort(dataArray);
    }

    @Test
    public void intStreamArraySortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.intStreamArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testIntStreamSortWhenObjectNull() throws DataArrayException {
        arraySortService.intStreamArraySort(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testIntStreamSortWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arraySortService.intStreamArraySort(dataArray);
    }

}