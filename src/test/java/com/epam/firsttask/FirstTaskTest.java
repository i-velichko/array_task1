package com.epam.firsttask;

import com.epam.firsttask.creator.DataArrayCreator;
import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.filereader.DataFileReader;
import com.epam.firsttask.parser.DataParser;
import com.epam.firsttask.service.ArrayСalculateService;
import com.epam.firsttask.validator.DataValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTaskTest {
    private final static String DATA_FILE_PATH = "src/test/recourses/data.txt";
    private static DataFileReader dataFileReader;
    private static DataValidator dataValidator;
    private static DataParser dataParser;
    private static DataArrayCreator dataArrayCreator;
    private static ArrayСalculateService arrayСalculateService;

    @BeforeClass
    public void setUp() {
        dataFileReader = new DataFileReader();
        dataValidator = new DataValidator();
        dataParser = new DataParser();
        dataArrayCreator = new DataArrayCreator();
        arrayСalculateService = new ArrayСalculateService();
    }

    @Test
    public void testPositiveScenario() throws DataArrayException {
        List<String> actualLinesFromFile;
        List<String> actualValidLines = new ArrayList<>();
        List<DataArray> actualDataArrays = new ArrayList<>();

        List<String> actualData = dataFileReader.readDataArray(DATA_FILE_PATH);

        actualLinesFromFile = dataFileReader.readDataArray(DATA_FILE_PATH);

        for (String s : actualLinesFromFile) {
            if (dataValidator.validateDataString(s)) {
                actualValidLines.add(s);
            }
        }
        int validLinesSize = actualValidLines.size();
        System.out.println(actualValidLines);

        for (String validLine : actualValidLines) {
            int[] ints = dataParser.convertStringToNumbers(validLine);
            DataArray dataArrayInstance = dataArrayCreator.fillTheArrayWithData(ints);
            actualDataArrays.add(dataArrayInstance);
        }

        DataArray dataArrayObject = actualDataArrays.get(0);

        int actualMaxValue = arrayСalculateService.findMaxValue(dataArrayObject);
        int expectedMaxValue = 87;
        Assert.assertEquals(expectedMaxValue, actualMaxValue);

        int actualMinValue = arrayСalculateService.findMinValue(dataArrayObject);
        int expectedMinValue = 1;
        Assert.assertEquals(expectedMinValue, actualMinValue);

        int actualSumValues = arrayСalculateService.sumValues(dataArrayObject);
        int expectedSumValues = 261;
        Assert.assertEquals(expectedSumValues, actualSumValues);

        int actualAverageValue = arrayСalculateService.findAverageValue(dataArrayObject);
        int expectedAverageValue = 26;
        Assert.assertEquals(expectedAverageValue, actualAverageValue);

        int actualPositiveElementsNumber = arrayСalculateService.fiandPositiveElementsNumber(dataArrayObject);
        int expectedPositiveElementsNumber = 10;
        Assert.assertEquals(expectedPositiveElementsNumber, actualPositiveElementsNumber);

        int actualNegativeElementsNumber = arrayСalculateService.findNegativeElementsNumber(dataArrayObject);
        int expectedNegativeElementsNumber = 0;
        Assert.assertEquals(expectedNegativeElementsNumber, actualNegativeElementsNumber);

//        DataArray actualArrayObject  = arrayService.replaceArrayElementsWithOppositeSigns(dataArrayObject);
//        Assert.assertEquals(new DataArray() , actualArrayObject);

    }
}
