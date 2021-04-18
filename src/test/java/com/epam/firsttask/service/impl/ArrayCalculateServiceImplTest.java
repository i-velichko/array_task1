package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
        int actual = arrayCalculateService.findMinValue(dataArray);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMinValueWhenObjectNull() throws DataArrayException {
        dataArray = null;
        int actual = arrayCalculateService.findMinValue(null);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testFindMinValueWhenArrayNull() throws DataArrayException {
        dataArray.setArray(null);
        int actual = arrayCalculateService.findMinValue(dataArray);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxValuePositiveScenario() throws DataArrayException {
        int actualMaxValue = arrayCalculateService.findMaxValue(dataArray);
        int expectedMaxValue = 87;
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testCalculateSumValuesPositiveScenario() throws DataArrayException {
        int actualSumValues = arrayCalculateService.calculateSumValues(dataArray);
        int expectedSumValues = 261;
        Assert.assertEquals(expectedSumValues, actualSumValues);
    }

    @Test
    public void testFindAverageValuePositiveScenario() throws DataArrayException {
        double actualAverageValue = arrayCalculateService.findAverageValue(dataArray);
        double expectedAverageValue = 26.1;
        Assert.assertEquals(expectedAverageValue, actualAverageValue);
    }

    @Test
    public void testFindPositiveElementsNumberPositiveScenario() throws DataArrayException {
        int actualPositiveElementsNumber = arrayCalculateService.findPositiveElementsNumber(dataArray);
        int expectedPositiveElementsNumber = 10;
        Assert.assertEquals(expectedPositiveElementsNumber, actualPositiveElementsNumber);
    }

    @Test
    public void testFindNegativeElementsNumberPositiveScenario() throws DataArrayException {
        int actualNegativeElementsNumber = arrayCalculateService.findNegativeElementsNumber(dataArray);
        int expectedNegativeElementsNumber = 0;
        Assert.assertEquals(expectedNegativeElementsNumber, actualNegativeElementsNumber);
    }

    @Test
    public void testReplaceArrayElementsWithOppositeSignsPositiveScenario() throws DataArrayException {
        int[] actualArrayBeforeReplacement = arrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);
        int[] expectedArrayAfterReplacement = {-3, -5, -12, -44, -2, -35, -66, -1, -6, -87};
        Assert.assertEquals(expectedArrayAfterReplacement, actualArrayBeforeReplacement);
    }
}