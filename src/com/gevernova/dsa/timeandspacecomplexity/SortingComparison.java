package com.gevernova.dsa.timeandspacecomplexity;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort (O(N^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort (O(N log N))
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Quick Sort (O(N log N))
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to calculate time complexity for sorting algorithms
    public static void compareSortingAlgorithms() {
        int[] datasetSizes = {1000, 10000, 1000000}; // Different dataset sizes to test

        // Loop over different dataset sizes to test all algorithms
        for (int size : datasetSizes) {
            Random rand = new Random();
            int[] data = rand.ints(size, 1, size * 10).toArray();  // Generate random data

            // Measure time for Bubble Sort
            int[] bubbleData = Arrays.copyOf(data, data.length);
            long startRec = System.nanoTime();
            bubbleSort(bubbleData);
            long endRec = System.nanoTime();
            long bubbleSortTime = endRec - startRec;

            // Measure time for Merge Sort
            int[] mergeData = Arrays.copyOf(data, data.length);
            startRec = System.nanoTime();
            mergeSort(mergeData);
            endRec = System.nanoTime();
            long mergeSortTime = endRec - startRec;

            // Measure time for Quick Sort
            int[] quickData = Arrays.copyOf(data, data.length);
            startRec = System.nanoTime();
            quickSort(quickData, 0, quickData.length - 1);
            endRec = System.nanoTime();
            long quickSortTime = endRec - startRec;

            // Output the performance results
            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + (bubbleSortTime / 1000000.0) + " ms");
            System.out.println("Merge Sort Time: " + (mergeSortTime / 1000000.0) + " ms");
            System.out.println("Quick Sort Time: " + (quickSortTime / 1000000.0) + " ms");

            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        compareSortingAlgorithms();
    }
}

