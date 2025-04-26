package com.gevernova.dsa.queueandstack.implementingstackusingqueue;

public class Main {
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("Top of the stack: " + stack.top());
        System.out.println("Size of the stack before removing element: " + stack.size());
        System.out.println("The deleted element is: " + stack.pop());
        System.out.println("Top of the stack after removing element: " + stack.top());
        System.out.println("Size of the stack after removing element: " + stack.size());
    }
}
