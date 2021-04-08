package com.epam.firsttask.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DataValidator {
    private final static Logger LOGGER = LogManager.getLogger();
    private static final String DATA_REGEX = "[0-9 ,-]+";

    public boolean validateDataString(String dataLine) {

        Pattern pattern = Pattern.compile(DATA_REGEX);
        Matcher matcher = pattern.matcher(dataLine);

        boolean result;

        if (matcher.matches()) {
            LOGGER.log(Level.INFO, "Data string is correct.");
            result = true;
        } else {
            LOGGER.log(Level.INFO, "Data string is incorrect.");
            result = false;
        }

        return result;

    }

}
