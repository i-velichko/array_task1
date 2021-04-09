package com.epam.firsttask.validator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataValidatorTest {
    private final static String TRUE_LINE = "3 5 12 44 2 -35 66 1 6 87";
    private final static String WRONG_LINE = "3 5z 12 44d 2 35 66 1 6 87";
    private static DataValidator dataValidator;

    @BeforeClass
    public void init() {
        dataValidator = new DataValidator();
    }

    @Test
    public void testValidateTrueDataString() {
        boolean actualResult = dataValidator.validateDataString(TRUE_LINE);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testValidateFalseDataString() {
        boolean actualResult = dataValidator.validateDataString(WRONG_LINE);
        Assert.assertFalse(actualResult);
    }

}