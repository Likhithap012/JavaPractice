package Strings.LevelThree;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine();
        boolean isAnagram = true;
        if (text1.length() != text2.length()) {
            isAnagram = false;
        } else {
            int[] frequency1 = new int[256];
            int[] frequency2 = new int[256];
            for (int i = 0; i < text1.length(); i++) {
                frequency1[text1.charAt(i)]++;
                frequency2[text2.charAt(i)]++;
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

