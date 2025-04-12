package com.gevernova.strings.levelone;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age set to: " + age);
    }
}

