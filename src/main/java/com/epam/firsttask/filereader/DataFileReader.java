package com.epam.firsttask.filereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataFileReader {

    private List<String> listOfDataForArray;

    public List<String> getListOfDataForArray() {
        return listOfDataForArray;
    }

    public void setListOfDataForArray(List<String> listOfDataForArray) {
        this.listOfDataForArray = listOfDataForArray;
    }

    public List<String> readDataArray(Path path) {

        try (Stream<String> lineStream = Files.lines(path)) {

            listOfDataForArray = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
        }
        return listOfDataForArray;
    }


}
