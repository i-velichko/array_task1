package com.epam.firsttask.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private final static Logger LOGGER = LogManager.getLogger();
    private static final String DATA_REGEX = "[\\d ,-]+";

    public boolean validateDataString(String dataLine) {

        boolean result = false;

        if (dataLine != null) {
            Pattern pattern = Pattern.compile(DATA_REGEX);
            Matcher matcher = pattern.matcher(dataLine);

            if (matcher.matches()) {
                LOGGER.log(Level.INFO, "Data string is valid.");
                result = true;
            } else {
                LOGGER.log(Level.INFO, "Data string is not valid.");
                result = false;
            }

        }
        return result;
    }
}
