package com.gevernova.stringpractice;

import java.util.Scanner;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String strOne = scanner.nextLine();
        String strTwo = scanner.nextLine();
        int lenOne = strOne.length();
        int lenTwo = strTwo.length();
        int minLen = Math.min(lenOne, lenTwo);
        boolean areEqual = true;
        for (int i = 0; i < minLen; i++) {
            char ch1 = strOne.charAt(i);
            char ch2 = strTwo.charAt(i);

            if (ch1 < ch2) {
                System.out.println(strOne + " comes before " + strTwo);
                areEqual = false;
                break;
            } else if (ch1 > ch2) {
                System.out.println(strTwo + " comes before " + strOne);
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if (lenOne == lenTwo) {
                System.out.println("Both strings are equal.");
            } else if (lenOne < lenTwo) {
                System.out.println(strOne + " comes before " + strTwo);
            } else {
                System.out.println(strTwo + " comes before " + strOne);
            }
        }

    }
}
