package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array (you can also make it null to trigger NullPointerException)
        int[] arr = {10, 20, 30, 40, 50};
        // int[] arr = null; // Uncomment this line to test NullPointerException

        System.out.print("Enter the index to retrieve value: ");

        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
