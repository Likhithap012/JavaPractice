package com.gevernova.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Create copies to avoid modifying original sets
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        // Remove common elements from both
        result.removeAll(set2);  // elements in set1 but not in set2
        temp.removeAll(set1);    // elements in set2 but not in set1

        // Union of the differences
        result.addAll(temp);

        System.out.println("Symmetric Difference: " + result);
    }
}
