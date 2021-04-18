package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final static int[] CORRECT_ARRAY = {1, 2, 3, 4, 5};
    private DataArray dataArray;

    @BeforeMethod
    public void setUp() {
        dataArray = new DataArray();
    }

    @Test
    public void testIsCorrectArray() {
        dataArray.setArray(CORRECT_ARRAY);
        boolean actualResult = ArrayValidator.isCorrectArray(dataArray);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsCorrectArrayWhenObjectNull() {
        Assert.assertFalse(ArrayValidator.isCorrectArray(null));
    }

    @Test
    public void testIsCorrectArrayWhenArrayNull() {
        dataArray.setArray(null);
        boolean actualResult = ArrayValidator.isCorrectArray(dataArray);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsCorrectArrayWhenArrayEmpty() {
        dataArray.setArray(new int[0]);
        boolean actualResult = ArrayValidator.isCorrectArray(dataArray);
        Assert.assertFalse(actualResult);
    }

}