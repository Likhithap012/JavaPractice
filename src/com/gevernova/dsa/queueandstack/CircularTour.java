package com.gevernova.dsa.queueandstack;

public class CircularTour {

    // Function to find the starting petrol pump index
    public static int getStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalPetrol = 0;
        int currentPetrol = 0;
        int start = 0;

        // Traverse all the petrol pumps
        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i] - distance[i];
            currentPetrol += petrol[i] - distance[i];

            // If current petrol becomes negative, reset the start point
            if (currentPetrol < 0) {
                start = i + 1; // Next pump becomes the new starting point
                currentPetrol = 0; // Reset current petrol to 0
            }
        }

        // If total petrol is less than 0, there's no solution
        return (totalPetrol >= 0) ? start : -1;
    }

    // Main function to test the Circular Tour problem
    public static void main(String[] args) {
        // Petrol available at each pump
        int[] petrol = { 4, 6, 7, 4 };

        // Distance to the next pump
        int[] distance = { 6, 5, 3, 5 };

        // Find and print the starting point
        int result = getStartingPump(petrol, distance);

        if (result != -1) {
            System.out.println("The tour can start at petrol pump index: " + result);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

