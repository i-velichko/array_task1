package com.epam.firsttask.entity;

import java.util.Arrays;

public class DataArray {
    private int[] array;

    public DataArray() {
    }

    public DataArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataArray dataArray = (DataArray) o;
        return Arrays.equals(array, dataArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}


