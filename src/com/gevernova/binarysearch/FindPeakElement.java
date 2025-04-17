package com.gevernova.binarysearch;

import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create and read array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Edge cases:
        if (n == 1) {
            System.out.println("Peak found at index: 0");
            return;
        }
        if (arr[0] > arr[1]) {
            System.out.println("Peak found at index: 0");
            return;
        }
        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("Peak found at index: " + (n - 1));
            return;
        }

        // Binary search for peak in the middle of the array
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if arr[mid] is a peak
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("Peak found at index: " + mid);
                return;
            }

            // If the left neighbor is smaller, move to the right half
            if (arr[mid] > arr[mid - 1]) {
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
