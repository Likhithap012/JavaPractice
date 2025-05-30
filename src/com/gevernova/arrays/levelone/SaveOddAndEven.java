package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class SaveOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] oddNumbers = new int[number];
        int[] evenNumbers = new int[number];
        int oddCount = 0, evenCount = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenCount++] = i;
            } else {
                oddNumbers[oddCount++] = i;
            }
        }
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
