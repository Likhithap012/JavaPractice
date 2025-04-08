package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class FindLongestAndShortestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int mini = Integer.MAX_VALUE; // Use a large initial value
        int maxi = Integer.MIN_VALUE; // Use a small initial value
        input = input + ' ';
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (cnt > 0) { // Ensure counting only non-empty words
                    mini = Math.min(cnt, mini);
                    maxi = Math.max(cnt, maxi);
                    cnt = 0;
                }
            } else {
                cnt++;
            }
        }

        System.out.println(mini);
        System.out.println(maxi);
    }
}
