package com.epam.firsttask.parser;


public class DataParser {

    public int[] convertStringToNumbers(String dataLine) {

        String[] charactersArray = dataLine.split(" ");
        int[] numbers = new int[charactersArray.length];
        for (int i = 0; i < charactersArray.length; i++) {
            numbers[i] = Integer.parseInt(charactersArray[i]);
        }
        return numbers;
    }

}

//проверка на налл
