package com.gevernova.dsa.queueandstack;

import java.util.Stack;

public class StackSort {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: if the stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the popped element back into the sorted stack
        insertSorted(stack, top);
    }

    // Helper function to insert an element into a sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: if the stack is empty or the element is greater than or equal to the top, insert it
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Otherwise, pop the top element and recursively call insertSorted
        int top = stack.pop();
        insertSorted(stack, element);

        // Push the popped element back to restore the stack
        stack.push(top);
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}

