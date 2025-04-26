package com.gevernova.dsa.hashmaps;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    // Function to find the length of the longest consecutive sequence
    public static int longestConsecutive(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        // Step 1: Insert all elements into a hash set
        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : numbers) {
            numberSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the array
        for (int num : numbers) {
            // Check if it's the start of a new sequence
            if (!numberSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (numberSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    // Main function to test the longest consecutive sequence function
    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of the longest consecutive sequence: " + longestConsecutive(numbers));
    }
}

