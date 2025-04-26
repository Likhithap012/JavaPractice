package com.gevernova.strings.levelthree;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String textOne = scanner.nextLine();
        System.out.print("Enter second string: ");
        String textTwo = scanner.nextLine();
        boolean isAnagram = true;
        if (textOne.length() != textTwo.length()) {
            isAnagram = false;
        } else {
            int[] frequency1 = new int[256];
            int[] frequency2 = new int[256];
            for (int i = 0; i < textOne.length(); i++) {
                frequency1[textOne.charAt(i)]++;
                frequency2[textTwo.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                if (frequency1[i] != frequency2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println("Are the two strings anagrams? " + isAnagram);
        scanner.close();
    }
}

