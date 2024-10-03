package org.search.algorithms;

public class Main {
    public static void main(String[] args) {
        //Interpolation search
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms(50);
        //System.out.println(searchAlgorithms.sequentialSearch(searchAlgorithms.getMediumValue()));
        int findingValue = searchAlgorithms.getMediumValue();
        System.out.println("Finding value: " + findingValue);
        searchAlgorithms.sort();
        //System.out.println("Index: " + searchAlgorithms.binarySearch(findingValue));
        System.out.println("Index: " + searchAlgorithms.interpolationSearch(findingValue));
        searchAlgorithms.print();
    }
}