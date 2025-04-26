package com.gevernova.collections.queue;

import java.util.ArrayList;
import java.util.List;

class CircularBuffer {
    int[] buffer;
    int size, start = 0, end = 0, count = 0;

    CircularBuffer(int k) {
        buffer = new int[k];
        size = k;
    }

    public void insert(int val) {
        buffer[end] = val;
        end = (end + 1) % size;
        if (count < size) count++;
        else start = (start + 1) % size;
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(start + i) % size]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); // Overwrites 1
        System.out.println("Buffer: " + cb.getBuffer()); // Output: [2, 3, 4]
    }
}

