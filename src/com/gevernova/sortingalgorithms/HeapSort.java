package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class HeapSort {

    // Function to heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // Left child index
        int right = 2 * i + 2;    // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the root
        if (largest != i) {
            // Swap root with largest
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Main function to perform Heap Sort
    public static void heapSort(int[] arr, int n) {
        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of applicants
        System.out.print("Enter the number of applicants: ");
        int n = sc.nextInt();

        int[] salary = new int[n];

        // Input salary demands
        System.out.println("Enter the salary demands:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        // Apply Heap Sort
        heapSort(salary, n);

        // Output sorted salary expectations
        System.out.println("Sorted salary demands (ascending):");
        for (int s : salary) {
            System.out.print(s + " ");
        }
    }
}

