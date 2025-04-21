package com.gevernova.dsa.timeandspacecomplexity;

import java.util.*;

public class SearchComparison {

    // Method to perform a linear search on an array
    public static boolean searchArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Method to perform a search on a HashSet
    public static boolean searchHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Method to perform a search on a TreeSet
    public static boolean searchTreeSet(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Method to measure and compare the search times
    public static void compareSearchPerformance(int[] arr, HashSet<Integer> hashSet, TreeSet<Integer> treeSet, int target) {
        // Measure time for Array search
        long startArr = System.nanoTime();
        searchArray(arr, target);
        long endArr = System.nanoTime();
        long arraySearchTime = endArr - startArr;

        // Measure time for HashSet search
        long startHashSet = System.nanoTime();
        searchHashSet(hashSet, target);
        long endHashSet = System.nanoTime();
        long hashSetSearchTime = endHashSet - startHashSet;

        // Measure time for TreeSet search
        long startTreeSet = System.nanoTime();
        searchTreeSet(treeSet, target);
        long endTreeSet = System.nanoTime();
        long treeSetSearchTime = endTreeSet - startTreeSet;

        // Output the search times
        System.out.println("Array Search Time: " + (arraySearchTime / 1000000.0) + " ms");
        System.out.println("HashSet Search Time: " + (hashSetSearchTime / 1000000.0) + " ms");
        System.out.println("TreeSet Search Time: " + (treeSetSearchTime / 1000000.0) + " ms");
    }

    public static void main(String[] args) {
        // Example dataset sizes for comparison
        int[] datasetSizes = {1000, 100000, 1000000};

        // Search target
        int target = 500000;

        for (int size : datasetSizes) {
            // Create an array, HashSet, and TreeSet with 'size' elements
            int[] arr = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Fill the data structures with values
            for (int i = 0; i < size; i++) {
                arr[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            System.out.println("Dataset Size: " + size);
            // Compare the search performance
            compareSearchPerformance(arr, hashSet, treeSet, target);
            System.out.println();
        }
    }
}

