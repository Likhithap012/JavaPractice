package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOne = scanner.nextInt();
        int ageTwo = scanner.nextInt();
        int ageThree = scanner.nextInt();
        int heightOne = scanner.nextInt();
        int heightTwo = scanner.nextInt();
        int heightThree = scanner.nextInt();

        // Finding the youngest friend
        String youngest;
        if (ageOne < ageTwo && ageOne < ageThree) {
            youngest = "Amar";
        } else if (ageTwo < ageOne && ageTwo < ageThree) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (heightOne > heightTwo && heightOne > heightThree) {
            tallest = "Amar";
        } else if (heightTwo > heightOne && heightTwo > heightThree) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
