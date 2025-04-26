package com.gevernova.stringpractice;

import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        int[] freqency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freqency[str.charAt(i)]++;
        }
        char mostFrequent = ' ';
        int maximum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freqency[str.charAt(i)] > maximum) {
                maximum = freqency[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }
        System.out.println("Most frequent character: " + mostFrequent);
    }
}
