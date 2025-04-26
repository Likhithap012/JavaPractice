package com.gevernova.arrays.leveltwo;

import java.util.Arrays;
import java.util.Scanner;
public class DynamicLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maximumDigit = 10;
        int[] digits = new int[maximumDigit];
        int index = 0;
        int temp = number;
        while (temp > 0) {
            if (index == maximumDigit) {
                maximumDigit += 10;
                digits = Arrays.copyOf(digits, maximumDigit);
            }
            digits[index++] = temp % 10;
            temp /= 10;
        }
        Arrays.sort(digits, 0, index);
        int largest = digits[index - 1];
        int secondLargest = -1;
        for (int i = index - 2; i >= 0; i--) {
            if (digits[i] < largest) {
                secondLargest = digits[i];
                break;
            }
        }
        System.out.println("Digits in the number: " + Arrays.toString(Arrays.copyOf(digits, index)));
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit (all digits are the same).");
        }
    }
}
