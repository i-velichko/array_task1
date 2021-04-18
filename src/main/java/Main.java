import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.service.impl.ArrayCalculateServiceImpl;
import com.epam.firsttask.service.impl.ArraySortServiceImpl;
import com.epam.firsttask.service.impl.IntStreamArrayCalculateServiceImpl;

import java.util.OptionalInt;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws DataArrayException {

        int[] array = {10, 2, -10, -4, 2, -2, 6, 20};
        ArrayCalculateServiceImpl arrayCalculateService = new ArrayCalculateServiceImpl();
        IntStreamArrayCalculateServiceImpl intStreamArrayCalculateService = new IntStreamArrayCalculateServiceImpl();
        ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();
        DataArray dataArray = new DataArray();
        dataArray.setArray(array);

        arrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);

        intStreamArrayCalculateService.replaceArrayElementsWithOppositeSigns(dataArray);
        intStreamArrayCalculateService.findNegativeElementsNumber(dataArray);
        intStreamArrayCalculateService.findPositiveElementsNumber(dataArray);
        intStreamArrayCalculateService.findAverageValue(dataArray);
        intStreamArrayCalculateService.calculateSumValues(dataArray);
        intStreamArrayCalculateService.findMaxValue(dataArray);
        intStreamArrayCalculateService.findMinValue(dataArray);

        arraySortService.bubbleArraySort(dataArray);
        arraySortService.insertionArraySort(dataArray);
        arraySortService.selectionArraySort(dataArray);

        int[] ints = new int[0];
        int sum = 0;
        System.out.println(sum);
        DataArray dataArray1 = new DataArray();
        dataArray1.setArray(ints);

        System.out.println(arrayCalculateService.findMinValue(dataArray1));



    }
}

