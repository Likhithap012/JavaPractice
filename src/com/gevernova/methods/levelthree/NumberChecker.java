package com.gevernova.methods.levelthree;

import java.util.*;

public class NumberChecker {

    // Method to count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        int num = number;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits into an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Check for Duck Number (0 present but not at the beginning)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    // Check for Armstrong Number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Find largest and second largest
    public static void findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + (secondMax != Integer.MIN_VALUE ? secondMax : "N/A"));
    }

    // Find smallest and second smallest
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }

        System.out.println("Smallest: " + min);
        System.out.println("Second Smallest: " + (secondMin != Integer.MAX_VALUE ? secondMin : "N/A"));
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
