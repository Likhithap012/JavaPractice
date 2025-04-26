package com.gevernova.collections.queue;

import java.util.*;

public class ReverseQueue {
    public static Queue<Integer> reverse(Queue<Integer> q) {
        if (q.isEmpty()) return q;
        int front = q.remove();
        q = reverse(q);
        q.add(front);
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10, 20, 30));
        System.out.println("Original: " + q);
        Queue<Integer> reversed = reverse(q);
        System.out.println("Reversed: " + reversed);
    }
}

