package com.gevernova.collections.queue.queuehospital;

import java.util.*;

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Triage Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
