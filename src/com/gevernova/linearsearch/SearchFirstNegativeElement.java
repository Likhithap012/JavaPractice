package com.gevernova.linearsearch;

import java.util.Scanner;

public class SearchFirstNegativeElement {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array from the user
        int size = sc.nextInt();

        // Declare and initialize the array with the given size
        int[] arr = new int[size];

        // Read elements into the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize ans to -1, assuming no negative number is found
        int ans = -1;

        // Traverse the array using Linear Search
        for (int i = 0; i < size; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                ans = i; // Store the index of the first negative number
                break;   // Exit the loop once the first negative is found
            }
        }

        // Print the result
        // If a negative number was found, its index is printed
        // Otherwise, -1 is printed indicating no negative number
        System.out.println(ans);
    }
}
