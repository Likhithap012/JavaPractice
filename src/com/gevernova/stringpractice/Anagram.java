package com.gevernova.stringpractice;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strOne = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String strTwo = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        int[] count = new int[256];
        boolean isAnagram = true;

        if (strOne.length() == strTwo.length()) {
            for (int i = 0; i < strOne.length(); i++) {
                count[strOne.charAt(i)]++;
                count[strTwo.charAt(i)]--;
            }

            for (int c : count) {
                if (c != 0) {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }

        if (isAnagram) {
            System.out.println("Yes, the strings are anagrams.");
        } else {
            System.out.println("No, the strings are not anagrams.");
        }
    }
}
