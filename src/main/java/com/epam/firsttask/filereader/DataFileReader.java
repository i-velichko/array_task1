package com.epam.firsttask.filereader;

import com.epam.firsttask.exception.DataArrayException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataFileReader {

    public List<String> readDataArray(String pathToFile) throws DataArrayException {
        List<String> listOfDataForArray;

        try (Stream<String> lineStream = Files.lines(Paths.get(pathToFile))) {
            //логи, логер всегда после успешного выполнения или перед ретуурном

            listOfDataForArray = lineStream.collect(Collectors.toList());

        } catch (IOException e) {
            throw new DataArrayException("Cannot open file " + pathToFile.toString());
        }
        return listOfDataForArray;
    }
}

//логи
// проверка на налл в самом начале метода и свой эксепшн,