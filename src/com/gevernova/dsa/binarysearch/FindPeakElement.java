package com.gevernova.dsa.binarysearch;

import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        // Create and read array elements
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Edge cases:
        if (size == 1) {
            System.out.println("Peak found at index: 0");
            return;
        }
        if (array[0] > array[1]) {
            System.out.println("Peak found at index: 0");
            return;
        }
        if (array[size - 1] > array[size - 2]) {
            System.out.println("Peak found at index: " + (size - 1));
            return;
        }

        // Binary search for peak in the middle of the array
        int low = 1, high = size - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if arr[mid] is a peak
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                System.out.println("Peak found at index: " + mid);
                return;
            }

            // If the left neighbor is smaller, move to the right half
            if (array[mid] > array[mid - 1]) {
                low = mid + 1;
            } else {
                // Otherwise, move to the left half
                high = mid - 1;
            }
        }

        // If no peak found (shouldn't happen with valid input)
        System.out.println("No peak found.");
    }
}
