package com.gevernova.dsa.linkedlist.singlelinkedlist.studentrecord;

public class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        StudentNode current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete by roll number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }

        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != roll) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Search by roll number
    public void searchByRollNumber(int roll) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                printStudent(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by roll number
    public void updateGrade(int roll, char newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == roll) {
                current.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Display all records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        StudentNode current = head;
        while (current != null) {
            printStudent(current);
            current = current.next;
        }
    }

    // Print helper
    private void printStudent(StudentNode student) {
        System.out.println("Roll No: " + student.rollNumber +
                ", Name: " + student.name +
                ", Age: " + student.age +
                ", Grade: " + student.grade);
    }
}
