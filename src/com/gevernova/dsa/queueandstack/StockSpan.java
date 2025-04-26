package com.gevernova.dsa.queueandstack;

import java.util.Stack;

public class StockSpan {

    // Function to calculate the stock span
    public static int[] calculateSpan(int[] prices) {
        int length = prices.length;
        int[] span = new int[length];

        // Stack to store indices of the stock prices
        Stack<Integer> stack = new Stack<>();

        // Loop through all stock prices
        for (int i = 0; i < length; i++) {
            // Pop elements from the stack while the price at the top is less than or equal to the current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If the stack is empty, the span is the current day + 1
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, the span is the difference between the current index and the index at the top of the stack
                span[i] = i - stack.peek();
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }

    // Main function to test the Stock Span calculation
    public static void main(String[] args) {
        int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = calculateSpan(prices);

        // Print the result
        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        System.out.println("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

