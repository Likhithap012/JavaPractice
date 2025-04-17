package com.gevernova.binarysearch;

import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Declare and initialize array
        int[] arr = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        // Binary search to find first occurrence
        int first = -1;
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // keep searching on left side
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Binary search to find last occurrence
        int last = -1;
        low = 0;
        high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // keep searching on right side
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Output the result
        if (first == -1 && last == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index: " + last);
        }
    }
}

