import com.epam.firsttask.entity.DataArray;
import com.epam.firsttask.exception.DataArrayException;
import com.epam.firsttask.service.impl.ArrayCalculateServiceImpl;
import com.epam.firsttask.service.impl.ArraySortServiceImpl;
import com.epam.firsttask.service.impl.IntStreamArrayCalculateServiceImpl;
import com.epam.firsttask.validator.ArrayValidator;

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


    }
}

