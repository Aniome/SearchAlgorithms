package org.search.algorithms;

public class Main {
    public static void main(String[] args) {
        //Linear search with barrier
        //Binary search
        //Interpolation search
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms(50);
        //System.out.println(searchAlgorithms.sequentialSearch(searchAlgorithms.getMediumValue()));
        searchAlgorithms.sort();
        int findingValue = searchAlgorithms.getMediumValue();
        System.out.println("Finding value: " + findingValue);
        System.out.println("Index: " + searchAlgorithms.binarySearch(findingValue));
        searchAlgorithms.print();
    }
}