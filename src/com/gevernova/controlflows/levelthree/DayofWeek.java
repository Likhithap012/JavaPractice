package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class DayofWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int Y = y % 100;
        int C = y / 100;
        int h = (d + (13 * (m + 1)) / 5 + Y + (Y / 4) + (C / 4) - (2 * C)) % 7;
        int dayOfWeek = (h + 6) % 7;
        System.out.println("Day of the week (0=Sunday, 1=Monday, ..., 6=Saturday): " + dayOfWeek);
    }
}
