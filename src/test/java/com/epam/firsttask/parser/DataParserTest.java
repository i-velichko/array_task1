package com.epam.firsttask.parser;

import com.epam.firsttask.exception.DataArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataParserTest {
    private final static String LINE_BEFORE_PARSING = "3 5 12 44 2 -35 66 1 6 87";
    private final static int[] EXPECTED_ARRAY = {3, 5, 12, 44, 2, -35, 66, 1, 6, 87};
    private static DataParser dataParser;

    @BeforeClass
    public void init() {
        dataParser = new DataParser();
    }

    @Test
    public void testConvertStringToNumbers() throws DataArrayException {
        int[] actualArray = dataParser.convertStringToNumbers(LINE_BEFORE_PARSING);
        Assert.assertEquals(EXPECTED_ARRAY, actualArray);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void falseWait() throws DataArrayException {
        int [] actualArray = dataParser.convertStringToNumbers(null);
        Assert.assertNull(actualArray);
    }
}