package com.gevernova.strings.levelone;

import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        boolean areEqual = (str1.length() == str2.length());
        if (areEqual) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }
        boolean builtInComparison = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + (areEqual ? "Strings are equal" : "Strings are not equal"));
        System.out.println("Comparison using equals(): " + (builtInComparison ? "Strings are equal" : "Strings are not equal"));

    }
}
