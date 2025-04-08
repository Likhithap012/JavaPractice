package com.gevernova.strings.levelone;

import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String charAtSubstring = "";
        for (int i = start; i < end; i++) {
            charAtSubstring += str.charAt(i);
        }
        String substringMethod = str.substring(start, end);
        System.out.println("charAt() substring: " + charAtSubstring);
        System.out.println("substring() method: " + substringMethod);
        System.out.println("Are they equal? " + charAtSubstring.equals(substringMethod));
    }
}
