package com.gevernova.strings.levelone;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        try {
            // Trying to access an index out of bounds
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index is out of bounds!");
        }
    }
}
