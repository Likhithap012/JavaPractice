package com.gevernova.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create an ArrayList to store the user inputs
        ArrayList<Integer> list = new ArrayList<>();

        // Step 3: Prompt user to enter how many elements they want to add
        System.out.print("Enter how many elements you want to add: ");
        int n = scanner.nextInt(); // Read the number of elements

        // Step 4: Read 'n' elements from the user and add them to the list
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt(); // Read each element
            list.add(element); // Add the element to the ArrayList
        }

        // Step 5: Create a HashSet to store unique elements (duplicates will be removed automatically)
        Set<Integer> s = new HashSet<>();

        // Step 6: Loop through the ArrayList and add each element to the HashSet
        for (Integer i : list) {
            s.add(i); // HashSet will ensure that only unique elements are added
        }

        // Step 7: Print the unique elements stored in the HashSet
        System.out.println("Unique elements (duplicates removed): " + s);
    }
}
