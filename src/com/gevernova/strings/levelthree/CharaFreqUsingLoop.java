package com.gevernova.strings.levelthree;
import java.util.Scanner;
public class CharaFreqUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] charArray = text.toCharArray();
        int[] frequency = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] != '0') {
                    frequency[i]++;
                    charArray[j] = '0'; // Mark duplicate characters as '0'
                }
            }
        }

        System.out.println("Character frequencies in the string:");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                System.out.println(charArray[i] + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}
