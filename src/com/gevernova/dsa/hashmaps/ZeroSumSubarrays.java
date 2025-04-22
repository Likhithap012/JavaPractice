package com.gevernova.dsa.hashmaps;

import java.util.*;

public class ZeroSumSubarrays {

    // Function to find all subarrays with sum zero
    public static void findZeroSumSubarrays(int[] arr) {
        // HashMap to store the cumulative sum and its indices
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        // Variable to store the cumulative sum
        int cumulativeSum = 0;

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // Update cumulative sum
            cumulativeSum += arr[i];

            // Check if the cumulative sum is zero
            if (cumulativeSum == 0) {
                // The subarray from the start to current index has a zero sum
                System.out.println("Subarray with zero sum: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1)));
            }

            // If the cumulative sum is already present in the map, it means there is a zero-sum subarray
            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> indices = sumMap.get(cumulativeSum);

                // Print all subarrays for all previous occurrences of this cumulative sum
                for (int index : indices) {
                    System.out.println("Subarray with zero sum: " + Arrays.toString(Arrays.copyOfRange(arr, index + 1, i + 1)));
                }
            }

            // Add the current cumulative sum to the map
            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }
    }

    // Main function to test the zero sum subarrays
    public static void main(String[] args) {
        int[] arr = { 6, -1, 3, -2, 2, 4, -4, 1, -1 };

        System.out.println("All subarrays with zero sum:");
        findZeroSumSubarrays(arr);
    }
}

