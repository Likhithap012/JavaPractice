package com.gevernova.dsa.timeandspacecomplexity;

import java.util.Arrays;
import java.util.Random;

public class LinearBinarySearch {

    // Linear Search Algorithm (O(N))
    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Algorithm (O(log N)) - Requires sorted data
    public static int binarySearch(int[] data, int target) {
        int left = 0, right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Function to calculate time and space complexity
    public static void calculateTimeAndSpaceComplexity() {
        int[] datasetSizes = {1000, 10000, 1000000};  // Different dataset sizes to test
        int target = -1; // Arbitrary target that will likely not be found (worst-case scenario)

        // Loop over different dataset sizes to test both algorithms
        for (int size : datasetSizes) {
            // Generate a random dataset of the given size
            Random rand = new Random();
            int[] data = rand.ints(size, 1, size * 10).toArray();  // Unique values for the dataset

            // Measure time for Linear Search
            long startRec = System.nanoTime();  // Start time
            linearSearch(data, target);
            long endRec = System.nanoTime();  // End time
            long linearSearchTime = endRec - startRec;

            // Measure time for Binary Search (requires sorted data)
            Arrays.sort(data);
            startRec = System.nanoTime();  // Start time
            binarySearch(data, target);
            endRec = System.nanoTime();  // End time
            long binarySearchTime = endRec - startRec;

            // Output the performance results
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + (linearSearchTime / 1000000.0) + " ms");
            System.out.println("Binary Search Time: " + (binarySearchTime / 1000000.0) + " ms");

            // Calculate memory usage (in bytes)
            System.out.println("Linear Search Memory: " + (size * Integer.BYTES / 1024.0) + " KB");
            System.out.println("Binary Search Memory: " + (size * Integer.BYTES / 1024.0) + " KB");
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        calculateTimeAndSpaceComplexity();
    }
}

