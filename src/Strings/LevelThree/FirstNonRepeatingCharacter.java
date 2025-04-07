package Strings.LevelThree;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char firstUniqueChar = findFirstNonRepeatingChar(input);

        if (firstUniqueChar != '\0') {
            System.out.println("First non-repeating character: " + firstUniqueChar);
        } else {
            System.out.println("No unique character found.");
        }

        scanner.close();
    }
}

