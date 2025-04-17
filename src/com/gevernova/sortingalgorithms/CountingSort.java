package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int n = ages.length;

        // Age range is 10 to 18 → indices 0 to 8 in count array
        int range = 9; // 18 - 10 + 1
        int[] count = new int[range];
        int[] output = new int[n];

        // Step 1: Count the frequency of each age
        for (int i = 0; i < n; i++) {
            count[ages[i] - 10]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - 10] - 1;
            output[position] = age;
            count[age - 10]--;
        }

        // Step 4: Copy output to original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        // Input student ages
        System.out.println("Enter student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Apply counting sort
        countingSort(ages);

        // Print sorted ages
        System.out.println("Sorted student ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
