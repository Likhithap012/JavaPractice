package com.gevernova.classandobject.levelone.computeareaofacircle;

// Circle class to hold radius and compute area
class Circle {
    int radius;         // variable to store radius (not directly used in calculation here)
    double ans;         // variable to store the computed area

    // Method to calculate the area of the circle using the given radius
    void calculate(int radius) {
        ans = Math.PI * radius * radius; // Area = π * r^2
    }

    // Method to display the calculated area
    void display() {
        System.out.println("Area of the Circle: " + ans);
    }
}
