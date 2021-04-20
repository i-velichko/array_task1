package com.epam.firsttask.service.impl;

import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.service.ArrayCalculateService;
import com.epam.firsttask.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamArrayCalculateServiceImpl implements ArrayCalculateService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public int findMinValue(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int minValue = IntStream.of(dataArray.getArray())
                .min()
                .orElseThrow();
        LOGGER.info("Use IntStream method. Min element value in this array = " + minValue);
        return minValue;
    }

    @Override
    public int findMaxValue(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int maxValue = IntStream.of(dataArray.getArray())
                .max()
                .orElseThrow();
        LOGGER.info("Use IntStream method. Max element value in this array = " + maxValue);
        return maxValue;
    }

    @Override
    public int calculateSumValues(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int sum = IntStream.of(dataArray.getArray())
                .sum();
        LOGGER.info("Use IntStream method. Sum  array elements = " + sum);
        return sum;
    }

    @Override
    public double findAverageValue(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        double averageValue = IntStream.of(dataArray.getArray())
                .average()
                .orElseThrow();
        LOGGER.info("Use IntStream method. Average  array elements value  = " + averageValue);
        return averageValue;
    }

    @Override
    public int findPositiveElementsNumber(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int[] ints = IntStream.of(dataArray.getArray())
                .filter(value -> value > 0)
                .toArray();
        LOGGER.info("Use IntStream method. Number of positive array elements = " + ints.length);
        return ints.length;
    }

    @Override
    public int findNegativeElementsNumber(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int[] ints = IntStream.of(dataArray.getArray())
                .filter(value -> value < 0)
                .toArray();
        LOGGER.info("Use IntStream method. Number of negative array elements = " + ints.length);
        return ints.length;
    }

    @Override
    public int[] replaceArrayElementsWithOppositeSigns(DataArray dataArray) throws DataArrayException {
        if (!ArrayValidator.isCorrectArray(dataArray)) {
            LOGGER.error("Array not valid for this operation");
            throw new DataArrayException();
        }
        int[] ints = IntStream.of(Arrays.copyOf(dataArray.getArray(), dataArray.getArray().length))
                .map(value -> value * -1)
                .toArray();
        LOGGER.info("Use IntStream method. Replaced with opposite signs array elements is - " + Arrays.toString(ints));
        return ints;
    }
}
