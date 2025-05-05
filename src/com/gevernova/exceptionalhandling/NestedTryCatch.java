package com.gevernova.exceptionalhandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4};
        int divisor = 0;

        try {
            // Outer try block: handles array access
            try {
                System.out.println("Accessing index 6: " + array[6]); // Throws ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }

            // Another risky operation inside outer try
            try {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i] / divisor); // Throws ArithmeticException
                }
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }

            System.out.println("This line won't throw exceptions.");
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues...");
    }
}
