package com.gevernova.classandobject.leveltwo.palindromechecker;

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
