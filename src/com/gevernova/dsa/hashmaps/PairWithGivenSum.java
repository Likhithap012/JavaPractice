package com.gevernova.dsa.hashmaps;

import java.util.HashSet;

public class PairWithGivenSum {

    // Function to check if a pair with the given sum exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        // Create a hash set to store visited elements
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Traverse the array
        for (int num : arr) {
            // Check if the complement exists in the hash set
            int complement = target - num;
            if (seenNumbers.contains(complement)) {
                // Pair found
                return true;
            }
            // Add current number to the hash set
            seenNumbers.add(num);
        }

        // No pair found
        return false;
    }

    // Main function to test the pair sum function
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair with sum " + target + " exists.");
        } else {
            System.out.println("No pair with sum " + target + " exists.");
        }
    }
}

