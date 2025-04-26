package com.gevernova.methods.levelthree;
import java.util.*;
public class DigitAnalyzer {

        // Method to count the number of digits
        public static int countDigits(int number) {
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }

        // Method to get digits in an array
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

        // Method to calculate sum of digits
        public static int sumOfDigits(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            return sum;
        }

        // Method to calculate sum of squares of digits
        public static int sumOfSquares(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, 2);
            }
            return sum;
        }

        // Method to check if the number is a Harshad number
        public static boolean isHarshad(int number, int[] digits) {
            int sum = sumOfDigits(digits);
            return number % sum == 0;
        }

        // Method to find frequency of each digit using a 2D array
        public static int[][] digitFrequency(int[] digits) {
            int[] freq = new int[10]; // index = digit, value = frequency

            for (int digit : digits) {
                freq[digit]++;
            }

            // Create 2D array with digit and its frequency
            int[][] result = new int[10][2];
            for (int i = 0; i < 10; i++) {
                result[i][0] = i;          // digit
                result[i][1] = freq[i];    // frequency
            }
            return result;
        }

        // Main method to test all functionality
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int[] digits = getDigitsArray(number);

            System.out.println("Total Digits: " + countDigits(number));
            System.out.println("Digits: " + Arrays.toString(digits));
            System.out.println("Sum of Digits: " + sumOfDigits(digits));
            System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
            System.out.println("Is Harshad Number? " + isHarshad(number, digits));

            System.out.println("\nDigit Frequency:");
            int[][] freqArray = digitFrequency(digits);
            for (int i = 0; i < 10; i++) {
                if (freqArray[i][1] > 0) {
                    System.out.println("Digit " + freqArray[i][0] + " => " + freqArray[i][1] + " time(s)");
                }
            }
        }
    }


