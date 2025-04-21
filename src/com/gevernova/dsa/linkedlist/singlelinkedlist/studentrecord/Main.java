package com.gevernova.dsa.linkedlist.singlelinkedlist.studentrecord;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.addAtEnd(1, "Alice", 20, 'A');
        list.addAtBeginning(2, "Bob", 21, 'B');
        list.addAtPosition(2, 3, "Charlie", 19, 'C');

        // Display
        System.out.println("\n-- All Students --");
        list.displayAll();

        // Search
        System.out.println("\n-- Searching Roll No 3 --");
        list.searchByRollNumber(3);

        // Update
        System.out.println("\n-- Updating Grade of Roll No 2 to A --");
        list.updateGrade(2, 'A');
        list.displayAll();

        // Delete
        System.out.println("\n-- Deleting Roll No 1 --");
        list.deleteByRollNumber(1);
        list.displayAll();
    }
}
