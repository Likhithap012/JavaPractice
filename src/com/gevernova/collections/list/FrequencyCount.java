package com.gevernova.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to store user input
        ArrayList<String> arrayList = new ArrayList<>();

        // Step 2: Read input dynamically from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); // number of items to add
        sc.nextLine(); // consume newline

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String item = sc.nextLine();
            arrayList.add(item); // add each string to the list
        }

        // Step 3: Create a map to store frequency of each element
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Step 4: Loop through the list and count frequency using Collections.frequency()
        for (String i : arrayList) {
            frequencyMap.put(i, Collections.frequency(arrayList, i));
        }

        // Step 5: Print the frequency map
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
