package com.gevernova.dsa.timeandspacecomplexity;

public class StringConcatenationComparison {

    // Method to concatenate strings using String (O(N²))
    public static String concatUsingString(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "a";
        }
        return result;
    }

    // Method to concatenate strings using StringBuilder (O(N))
    public static String concatUsingStringBuilder(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }

    // Method to concatenate strings using StringBuffer (O(N))
    public static String concatUsingStringBuffer(int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }

    // Method to calculate the time taken for each method
    public static void compareConcatenationPerformance() {
        int[] datasetSizes = {1000, 10000, 1000000}; // Different dataset sizes to test

        // Loop over different dataset sizes to test all methods
        for (int size : datasetSizes) {
            System.out.println("Dataset Size: " + size);

            // Measure time for String concatenation
            long startRec = System.nanoTime();
            concatUsingString(size);
            long endRec = System.nanoTime();
            long stringConcatTime = endRec - startRec;

            // Measure time for StringBuilder concatenation
            startRec = System.nanoTime();
            concatUsingStringBuilder(size);
            endRec = System.nanoTime();
            long stringBuilderConcatTime = endRec - startRec;

            // Measure time for StringBuffer concatenation
            startRec = System.nanoTime();
            concatUsingStringBuffer(size);
            endRec = System.nanoTime();
            long stringBufferConcatTime = endRec - startRec;

            // Output the performance results
            System.out.println("String Concatenation Time: " + (stringConcatTime / 1000000.0) + " ms");
            System.out.println("StringBuilder Concatenation Time: " + (stringBuilderConcatTime / 1000000.0) + " ms");
            System.out.println("StringBuffer Concatenation Time: " + (stringBufferConcatTime / 1000000.0) + " ms");
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        compareConcatenationPerformance();
    }
}

