package com.gevernova.recursions;

public class PalindromeChecker {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Characters don't match
        }
        return isPalindrome(str, start + 1, end - 1); // Move inward
    }

    public static void main(String[] args) {
        String input = "racecar";
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }
}

