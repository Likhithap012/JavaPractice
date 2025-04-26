package com.gevernova.dsa.binarysearch;

import java.util.*;

public class SearchChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        boolean[] present = new boolean[size + 1]; // To track presence of numbers from 1 to n

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

            // Mark present if number is in range 1 to n
            if (arr[i] > 0 && arr[i] <= size) {
                present[arr[i]] = true;
            }
        }

        // LINEAR SEARCH: Find first missing positive
        int missing = -1;
        for (int i = 1; i <= size; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }
        if (missing == -1) {
            missing = size + 1;
        }

        System.out.println("First missing positive integer: " + missing);

        // Sort the array before Binary Search
        Arrays.sort(arr);

        // Input target number to search
        System.out.print("Enter the target number to search: ");
        int target = scanner.nextInt();

        // BINARY SEARCH: Search for the target element
        int low = 0, high = size - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (index != -1) {
            System.out.println("Target " + target + " found at index (after sorting): " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}

