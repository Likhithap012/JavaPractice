package Strings.LevelThree;

import java.util.Scanner;

public class PalindromeChec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        boolean isPalindrome1 = true;
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome1 = false;
                break;
            }
            start++;
            end--;
        }
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        char[] charArray = text.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }
        boolean isPalindrome3 = text.equals(new String(reversedArray));
        System.out.println("Palindrome Check (Logic 1 - Two Pointers): " + isPalindrome1);
        System.out.println("Palindrome Check (Logic 2 - Recursion): " + isPalindrome2);
        System.out.println("Palindrome Check (Logic 3 - Reverse String): " + isPalindrome3);
        scanner.close();
    }

    private static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }
}

