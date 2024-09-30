package org.search.algorithms;

public class SearchAlgorithms {
    private final int[] array;
    private final int length;

    public int[] getArray() {
        return array;
    }

    public int getFirstValue() {
        return array[0];
    }

    public SearchAlgorithms(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        length = size;
    }

    public boolean sequentialSearch(int k) {
        for (int i = 0; i < length; i++)
        {
            if (array[i] == k)
                return true;
        }
        return false;
    }
}
