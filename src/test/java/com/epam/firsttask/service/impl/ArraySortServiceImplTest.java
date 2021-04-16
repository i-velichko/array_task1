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
    private DataArray dataArray = new DataArray();

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

    @Test(expectedExceptions = NullPointerException.class)
    public void testBubbleSortIsObjectNull() throws DataArrayException {
        DataArray dataArray = new DataArray();
        Assert.assertNull(arraySortService.bubbleArraySort(dataArray));
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testBubbleSortIsArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        Assert.assertNull(arraySortService.bubbleArraySort(dataArray));
    }

    @Test
    public void testInsertionSortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.insertionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertionSortIsObjectNull() throws DataArrayException {
        DataArray dataArray = new DataArray();
        Assert.assertNull(arraySortService.insertionArraySort(dataArray));
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testInsertionSortIsArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        Assert.assertNull(arraySortService.insertionArraySort(dataArray));
    }

    @Test
    public void testSelectionSortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.selectionArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSelectionSortIsObjectNull() throws DataArrayException {
        DataArray dataArray = new DataArray();
        Assert.assertNull(arraySortService.selectionArraySort(dataArray));
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testSelectionSortIsArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        Assert.assertNull(arraySortService.selectionArraySort(dataArray));
    }

    @Test
    public void intStreamArraySortTrueResult() throws DataArrayException {
        int[] actualArrayAfterSorting = arraySortService.intStreamArraySort(dataArray);
        Assert.assertEquals(EXPECTED_ARRAY_AFTER_SORTING, actualArrayAfterSorting);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testIntStreamSortIsObjectNull() throws DataArrayException {
        DataArray dataArray = new DataArray();
        Assert.assertNull(arraySortService.intStreamArraySort(dataArray));
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testIntStreamSortIsArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        Assert.assertNull(arraySortService.intStreamArraySort(dataArray));
    }

}