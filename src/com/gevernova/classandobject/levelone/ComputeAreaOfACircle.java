package com.gevernova.classandobject.levelone;

import java.util.Scanner;

// Circle class to hold radius and compute area
class Circle {
    int radius;         // variable to store radius (not directly used in calculation here)
    double ans;         // variable to store the computed area

    // Method to calculate the area of the circle using the given radius
    void calculate(int r) {
        ans = Math.PI * r * r; // Area = π * r^2
    }

    // Method to display the calculated area
    void display() {
        System.out.println("Area of the Circle: " + ans);
    }
}

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
