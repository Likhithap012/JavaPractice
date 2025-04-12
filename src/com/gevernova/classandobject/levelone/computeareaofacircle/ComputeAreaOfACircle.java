package com.gevernova.classandobject.levelone.computeareaofacircle;

import java.util.Scanner;

public class ComputeAreaOfACircle {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle();

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        // Reading radius from user
        int radius = sc.nextInt();

        // Calling method to calculate area
        circle.calculate(radius);

        // Calling method to display the area
        circle.display();
    }
}
