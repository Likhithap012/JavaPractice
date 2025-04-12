package com.gevernova.classandobject.leveltwo.palindromechecker;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of PalindromeChecker
        PalindromeCheckers checker = new PalindromeCheckers();

        // Take input from user
        System.out.print("Enter a string to check for palindrome: ");
        checker.text = scanner.nextLine();

        // Display the result
        checker.displayResult();
    }
}
