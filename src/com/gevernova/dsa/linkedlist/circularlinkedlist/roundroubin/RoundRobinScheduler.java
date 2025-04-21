package com.gevernova.dsa.linkedlist.circularlinkedlist.roundroubin;

public class RoundRobinScheduler {
    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;
    private int numberOfProcesses = 0;

    // Add a new process to the circular linked list
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(processId, burstTime, priority);

        if (head == null) {
            head = tail = newProcess;
            head.next = head; // Circular reference
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Circular reference
        }

        numberOfProcesses++;
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode temp = head;
        ProcessNode prev = null;

        // If the head is the process to be removed
        if (head.processId == processId) {
            if (head == tail) {
                head = tail = null; // Only one process left, remove it
            } else {
                head = head.next;
                tail.next = head; // Maintain circular reference
            }
            System.out.println("Process with ID " + processId + " removed.");
            numberOfProcesses--;
            return;
        }

        // Search for the process in the circular list
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.processId != processId);

        if (temp.processId == processId) {
            prev.next = temp.next;
            if (temp == tail) {
                tail = prev; // Update the tail if the last node is removed
            }
            System.out.println("Process with ID " + processId + " removed.");
            numberOfProcesses--;
        } else {
            System.out.println("Process ID not found.");
        }
    }

    // Execute the round robin scheduling
    public void executeRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode current = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        while (numberOfProcesses > 0) {
            // If process has remaining time, execute it
            if (current.remainingTime > 0) {
                int executionTime = Math.min(current.remainingTime, timeQuantum);

                // Wait time = current time - arrival time (not used in this implementation)
                totalWaitingTime += (executionTime * (numberOfProcesses - 1));

                // Decrease remaining time
                current.remainingTime -= executionTime;
                totalTurnaroundTime += executionTime;

                // Display the process and its remaining time
                System.out.println("Process " + current.processId + " executed for " + executionTime + " units.");

                // If process is fully executed, remove it
                if (current.remainingTime == 0) {
                    removeProcess(current.processId);
                    current = current.next; // Move to next process in the list
                }
            } else {
                current = current.next; // No execution required for completed process
            }
            // Move to the next process in the circular queue
            current = current.next;
        }

        // Calculate and display the average waiting and turnaround times
        double averageWaitingTime = (double) totalWaitingTime / numberOfProcesses;
        double averageTurnaroundTime = (double) totalTurnaroundTime / numberOfProcesses;

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

    // Display the current state of processes in the queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode current = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("Process ID: " + current.processId +
                    ", Burst Time: " + current.burstTime +
                    ", Remaining Time: " + current.remainingTime +
                    ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}

