package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageA = scanner.nextInt();
        int ageB = scanner.nextInt();
        int ageC = scanner.nextInt();
        int heightA = scanner.nextInt();
        int heightB = scanner.nextInt();
        int heightC = scanner.nextInt();

        // Finding the youngest friend
        String youngest;
        if (ageA < ageB && ageA < ageC) {
            youngest = "Amar";
        } else if (ageB < ageA && ageB < ageC) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (heightA > heightB && heightA > heightC) {
            tallest = "Amar";
        } else if (heightB > heightA && heightB > heightC) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
