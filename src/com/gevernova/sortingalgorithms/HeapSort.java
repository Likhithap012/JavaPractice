package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class HeapSort {

    // Function to heapify a subtree rooted at index i
    public static void heapify(int[] arr, int number, int index) {
        int largest = index;          // Initialize largest as root
        int left = 2 * index + 1;     // Left child index
        int right = 2 * index + 2;    // Right child index

        // If left child is larger than root
        if (left < number && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the current largest
        if (right < number && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the root
        if (largest != index) {
            // Swap root with largest
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, number, largest);
        }
    }

    // Main function to perform Heap Sort
    public static void heapSort(int[] arr, int number) {
        // Step 1: Build Max Heap
        for (int i = number / 2 - 1; i >= 0; i--) {
            heapify(arr, number, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = number - 1; i >= 0; i--) {
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
        Scanner scanner = new Scanner(System.in);

        // Input number of applicants
        System.out.print("Enter the number of applicants: ");
        int size = scanner.nextInt();

        int[] salary = new int[size];

        // Input salary demands
        System.out.println("Enter the salary demands:");
        for (int i = 0; i < size; i++) {
            salary[i] = scanner.nextInt();
        }

        // Apply Heap Sort
        heapSort(salary, size);

        // Output sorted salary expectations
        System.out.println("Sorted salary demands (ascending):");
        for (int s : salary) {
            System.out.print(s + " ");
        }
    }
}

