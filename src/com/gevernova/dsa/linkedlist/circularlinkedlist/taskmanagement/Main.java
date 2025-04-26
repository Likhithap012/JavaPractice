package com.gevernova.dsa.linkedlist.circularlinkedlist.taskmanagement;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(101, "Write Report", 2, "2025-04-25");
        scheduler.addAtBeginning(102, "Team Meeting", 1, "2025-04-22");
        scheduler.addAtPosition(2, 103, "Code Review", 3, "2025-04-23");

        scheduler.displayAllTasks();

        System.out.println("\nCycling through tasks:");
        scheduler.viewCurrentAndMoveNext(); // Task 102
        scheduler.viewCurrentAndMoveNext(); // Task 103
        scheduler.viewCurrentAndMoveNext(); // Task 101

        System.out.println("\n Search by Priority:");
        scheduler.searchByPriority(2);

        System.out.println("\n Removing Task ID 103");
        scheduler.removeById(103);

        System.out.println("\nUpdated Tasks:");
        scheduler.displayAllTasks();
    }
}

