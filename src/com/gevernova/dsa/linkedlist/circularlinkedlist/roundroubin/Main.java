package com.gevernova.dsa.linkedlist.circularlinkedlist.roundroubin;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Add processes to the scheduler
        scheduler.addProcess(1, 5, 3); // Process 1, Burst Time = 5, Priority = 3
        scheduler.addProcess(2, 8, 2); // Process 2, Burst Time = 8, Priority = 2
        scheduler.addProcess(3, 2, 1); // Process 3, Burst Time = 2, Priority = 1
        scheduler.addProcess(4, 6, 4); // Process 4, Burst Time = 6, Priority = 4

        // Display the process queue
        scheduler.displayQueue();

        // Execute the round robin scheduling with a time quantum of 3
        scheduler.executeRoundRobin(3);
    }
}

