package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayCalculateServiceImplTest {
    private final static int[] ARRAY_FOR_CALCULATE = {3, 5, 12, 44, 2, 35, 66, 1, 6, 87};
    private final ArrayCalculateServiceImpl arrayCalculateService = new ArrayCalculateServiceImpl();
    private DataArray dataArray;

    @BeforeMethod
    public void setUp() {
        dataArray = new DataArray();
        dataArray.setArray(ARRAY_FOR_CALCULATE);
    }

    @Test
    public void testFindMinValuePositiveScenario() throws DataArrayException {
        int actualMaxValue = arrayCalculateService.findMinValue(dataArray);
        int expectedMinValue = 1;
        Assert.assertEquals(expectedMinValue, actualMaxValue);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMinValueWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.findMinValue(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMinValueWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.findMinValue(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMinValueWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.findMinValue(dataArray);
    }

    @Test
    public void testFindMaxValuePositiveScenario() throws DataArrayException {
        int actualMaxValue = arrayCalculateService.findMaxValue(dataArray);
        int expectedMaxValue = 87;
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMaxValueWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.findMaxValue(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMaxValueWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.findMaxValue(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMaxValueWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.findMaxValue(dataArray);
    }

    @Test
    public void testCalculateSumValuesPositiveScenario() throws DataArrayException {
        int actualSumValues = arrayCalculateService.calculateSumValues(dataArray);
        int expectedSumValues = 261;
        Assert.assertEquals(expectedSumValues, actualSumValues);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testCalculateSumValuesWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.calculateSumValues(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testCalculateSumValuesWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.calculateSumValues(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testCalculateSumValuesWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.calculateSumValues(dataArray);
    }

    @Test
    public void testFindAverageValuePositiveScenario() throws DataArrayException {
        double actualAverageValue = arrayCalculateService.findAverageValue(dataArray);
        double expectedAverageValue = 26.1;
        Assert.assertEquals(expectedAverageValue, actualAverageValue);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindAverageValueWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.findAverageValue(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindAverageValueWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.findAverageValue(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindAverageValueWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.findAverageValue(dataArray);
    }

    @Test
    public void testFindPositiveElementsNumberPositiveScenario() throws DataArrayException {
        int actualPositiveElementsNumber = arrayCalculateService.findPositiveElementsNumber(dataArray);
        int expectedPositiveElementsNumber = 10;
        Assert.assertEquals(expectedPositiveElementsNumber, actualPositiveElementsNumber);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindPositiveElementsNumberWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.findPositiveElementsNumber(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindPositiveElementsNumberWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.findPositiveElementsNumber(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindPositiveElementsNumberWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.findPositiveElementsNumber(dataArray);
    }

    @Test
    public void testFindNegativeElementsNumberPositiveScenario() throws DataArrayException {
        int actualNegativeElementsNumber = arrayCalculateService.findNegativeElementsNumber(dataArray);
        int expectedNegativeElementsNumber = 0;
        Assert.assertEquals(expectedNegativeElementsNumber, actualNegativeElementsNumber);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindNegativeElementsNumberWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.findNegativeElementsNumber(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindNegativeElementsNumberWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.findNegativeElementsNumber(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindNegativeElementsNumberWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.findNegativeElementsNumber(dataArray);
    }

    @Test
    public void testReplaceArrayElementsWithOppositeSignsPositiveScenario() throws DataArrayException {
        int[] actualArrayBeforeReplacement = arrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);
        int[] expectedArrayAfterReplacement = {-3, -5, -12, -44, -2, -35, -66, -1, -6, -87};
        Assert.assertEquals(expectedArrayAfterReplacement, actualArrayBeforeReplacement);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testReplaceArrayElementsWithOppositeSignsWhenObjectNull() throws DataArrayException {
        dataArray = null;
        arrayCalculateService.replaceArrayElementsWithOppositeSigns(null);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testReplaceArrayElementsWithOppositeSignsWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        arrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testReplaceArrayElementsWithOppositeSignsWhenArrayEmpty() throws DataArrayException {
        dataArray.setArray(new int[0]);
        arrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);
    }
}