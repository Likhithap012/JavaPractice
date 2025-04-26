package com.gevernova.collections.set;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // Create a HashSet
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Convert to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(sortedList);

        // Output the sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}

