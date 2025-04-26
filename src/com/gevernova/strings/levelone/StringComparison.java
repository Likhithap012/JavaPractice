package com.gevernova.strings.levelone;

import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter first string: ");
        String strOne = scanner.nextLine();
        System.out.print("Enter second string: ");
        String strTwo = scanner.nextLine();
        boolean areEqual = (strOne.length() == strTwo.length());
        if (areEqual) {
            for (int i = 0; i < strOne.length(); i++) {
                if (strOne.charAt(i) != strTwo.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }
        boolean builtInComparison = strOne.equals(strTwo);
        System.out.println("Comparison using charAt(): " + (areEqual ? "Strings are equal" : "Strings are not equal"));
        System.out.println("Comparison using equals(): " + (builtInComparison ? "Strings are equal" : "Strings are not equal"));

    }
}
