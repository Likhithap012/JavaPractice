package com.gevernova.dsa.linkedlist.circularlinkedlist.taskmanagement;

public class TaskScheduler {
    private TaskNode head = null;
    private TaskNode current = null;

    // Add task at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            head.next = head;
            current = head;
        } else {
            TaskNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Add task at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        if (head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }

        tail.next = newNode;
        newNode.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeById(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        // Single node case
        if (head.taskId == taskId && head.next == head) {
            head = null;
            current = null;
            return;
        }

        // Head node case
        if (head.taskId == taskId) {
            TaskNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head;
            if (current.taskId == taskId) current = head;
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (current.taskId == taskId) current = prev.next;
                return;
            }
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View current task and move to next
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks scheduled.");
            return;
        }
        printTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        System.out.println("Tasks in Scheduler:");
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search tasks by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks found with priority " + priority);
    }

    // Print task details
    private void printTask(TaskNode task) {
        System.out.println("Task ID: " + task.taskId +
                ", Name: " + task.taskName +
                ", Priority: " + task.priority +
                ", Due Date: " + task.dueDate);
    }
}

