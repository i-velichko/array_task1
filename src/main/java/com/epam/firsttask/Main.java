package com.epam.firsttask;

import com.epam.firsttask.creator.DataArrayCreator;
import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.filereader.DataFileReader;
import com.epam.firsttask.parser.DataParser;
import com.epam.firsttask.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger();
    private final static Path PATH = Paths.get("data/data.txt");

    public static void main(String[] args) throws DataArrayException {

        List<String> linesFromFile;
        List<String> validLines = new ArrayList<>();
        List<DataArray> dataArrays = new ArrayList<>();

        DataArray dataArray = new DataArray();
        DataFileReader dataFileReader = new DataFileReader();
        DataValidator dataValidator = new DataValidator();
        DataParser dataParser = new DataParser();
        DataArrayCreator dataArrayCreator = new DataArrayCreator();

        linesFromFile = dataFileReader.readDataArray(PATH);
        LOGGER.log(Level.INFO, "Data from file");

        for (String s : linesFromFile) {
            if (dataValidator.validateDataString(s)) {
                validLines.add(s);
            }

        }
        int validLinesSize = validLines.size();
        System.out.println(validLines);

        for (String validLine : validLines) {
            int[] ints = dataParser.convertStringToNumbers(validLine);
            DataArray dataArrayInstance = dataArrayCreator.fillTheArrayWithData(ints);
            dataArrays.add(dataArrayInstance);
        }




    }
}


