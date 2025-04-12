package com.gevernova.arrays.leveltwo;

import java.util.Arrays;
import java.util.Scanner;
public class LargestAndSecongLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        Arrays.sort(digits);
        int largest = digits[count - 1];
        int secondLargest = -1;
        for (int i = count - 2; i >= 0; i--) {
            if (digits[i] < largest) {
                secondLargest = digits[i];
                break;
            }
        }
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit (all digits are the same).");
        }

    }
}
