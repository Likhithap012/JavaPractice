package com.gevernova.dsa.binarysearch;

import java.util.Scanner;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Take input for the target value to search
        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Loop through each row of the matrix
        for (int i = 0; i < rows; i++) {
            // Check if the target could be in this row
            if (target >= matrix[i][0] && target <= matrix[i][cols - 1]) {

                // Perform binary search in that row
                int low = 0, high = cols - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (matrix[i][mid] == target) {
                        found = true;
                        break;
                    } else if (target > matrix[i][mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                // If found, no need to check further rows
                if (found) break;
            }
        }

        // Print result
        System.out.println(found ? "true" : "false");
    }
}
