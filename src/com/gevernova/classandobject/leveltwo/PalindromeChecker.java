package com.gevernova.classandobject.leveltwo;
import java.util.Scanner;

class PalindromeCheckers {
    String text;
boolean isPalindrome() {
    String reversed = new StringBuilder(text).reverse().toString();
    return text.equalsIgnoreCase(reversed);
}

// Method to display result
void displayResult() {
    if (isPalindrome()) {
        System.out.println("The string \"" + text + "\" is a palindrome.");
    } else {
        System.out.println(" The string \"" + text + "\" is not a palindrome.");
    }
}
}

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
