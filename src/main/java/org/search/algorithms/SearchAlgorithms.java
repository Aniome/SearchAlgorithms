package org.search.algorithms;

import java.util.Arrays;

public class SearchAlgorithms {
    private final int[] array;
    private final int length;

    public int[] getArray() {
        return array;
    }

    public int getMediumValue() {
        return array[length / 2];
    }

    public void sort(){
        Arrays.sort(array);
    }

    public SearchAlgorithms(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        length = size;
    }

    public int sequentialSearch(int value) {
        for (int index = 0; index < length; index++) {
            if (array[index] == value)
                return index;
        }
        return -1;
    }

    public int binarySearch(int value) {
        int m, left, right;
        left = 0; right = length - 1;
        while (left < right) {
            m = left + (right - left) / 2;
            if (array[m] < value)
                left = m;
            if (array[m] > value)
                right = m;
            if (array[m] == value)
                return m;
        }
        return -1;
    }

    public int interpolationSearch(int value) {
        int l = 0;
        int r = length - 1;
        int m;
        while (array[l] < value && array[r] > value) {
            m = l + ((value - array[l]) * (r - l)) / (array[r] - array[l]);
            if (array[m] < value)
                l = m + 1;
            else if (array[m] > value)
                r = m - 1;
            else
                return m;
        }
        if (array[l] == value)
            return l;
        else if (array[r] == value)
            return r;
        else
            return -1;
    }

    public void print(){
        for (int i = 0; i < length; i++) {
            System.out.print(i + " = " + array[i] + "; ");
            if (i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
