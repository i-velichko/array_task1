package com.epam.firsttask.filereader;

import com.epam.firsttask.exception.DataArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DataFileReaderTest {
    private final static String DATA_FILE_PATH = "src/test/recourses/data.txt";
    private final static String WRONG_FILE_PATH = "src/test/recourses/wrongData.txt";
    private static DataFileReader dataFileReader;

    @BeforeClass
    public void init() {
        dataFileReader = new DataFileReader();
    }

    @Test
    public void testReadDataForArraySuccess() throws DataArrayException {
        List<String> actualData = dataFileReader.readDataArray(DATA_FILE_PATH);
        int actualCountLines = actualData.size();
        int expectedCountLines = 5;
        Assert.assertEquals(actualCountLines, expectedCountLines);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testReadDataFileNotFound() throws DataArrayException {
        dataFileReader.readDataArray(WRONG_FILE_PATH);
    }

    @Test(expectedExceptions = DataArrayException.class)
    public void testReadDataNullExp() throws DataArrayException {
        dataFileReader.readDataArray(null);
    }

}