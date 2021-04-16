package com.epam.firsttask.validator;

import com.epam.firsttask.entity.DataArray;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final static int[] CORRECT_ARRAY = {1, 2, 3, 4, 5};
    private final static int[] EMPTY_ARRAY = new int[0];
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

    @Test (expectedExceptions = NullPointerException.class)
    public void testIsObjectNull(){
        boolean actualResult = ArrayValidator.isCorrectArray(dataArray);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsArrayEmpty(){
        dataArray.setArray(EMPTY_ARRAY);
        boolean actualResult = ArrayValidator.isCorrectArray(dataArray);
        Assert.assertFalse(actualResult);
    }
}