package com.epam.firsttask.parser;


import com.epam.firsttask.exception.DataArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataParser {
    private final static Logger LOGGER = LogManager.getLogger();

    public int[] convertStringToNumbers(String dataLine) throws DataArrayException {

        if (dataLine == null){
            throw new DataArrayException("Line for convert is null");
        }

        String[] charactersArray = dataLine.split(" ");
        int[] numbers = new int[charactersArray.length];
        for (int i = 0; i < charactersArray.length; i++) {
            numbers[i] = Integer.parseInt(charactersArray[i]);
        }
        LOGGER.info("Parsing the string was successful");
        return numbers;
    }

}

