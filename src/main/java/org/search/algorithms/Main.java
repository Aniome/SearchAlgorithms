package org.search.algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Linear search with barrier
        //Binary search
        //Interpolation search
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms(50);
        System.out.println(searchAlgorithms.sequentialSearch(searchAlgorithms.getFirstValue()));
        System.out.println(Arrays.toString(searchAlgorithms.getArray()));
    }
}