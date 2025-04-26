package com.gevernova.collections.queue;

import java.util.*;

public class BinaryNumbers {
    public static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String binary = q.remove();
            result.add(binary);
            q.add(binary + "0");
            q.add(binary + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Binary Numbers: " + generate(N));
    }
}

