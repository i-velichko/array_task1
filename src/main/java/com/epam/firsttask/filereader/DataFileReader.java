package com.epam.firsttask.filereader;

import com.epam.firsttask.exception.DataArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataFileReader {
    private final static Logger LOGGER = LogManager.getLogger();

    public List<String> readDataArray(String pathToFile) throws DataArrayException {
        List<String> listOfDataForArray;

        if (pathToFile == null) {
            throw new DataArrayException("File path does not exist");
        }

        try (Stream<String> lineStream = Files.lines(Paths.get(pathToFile))) {
            LOGGER.info("File read successfully.");

            listOfDataForArray = lineStream.collect(Collectors.toList());

        } catch (IOException e) {
            throw new DataArrayException("Cannot open file " + pathToFile);
        }
        return listOfDataForArray;
    }
}

