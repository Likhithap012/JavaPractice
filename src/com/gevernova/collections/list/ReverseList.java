package com.gevernova.collections.list;

import java.util.*;

public class ReverseList {

    // Method to print ArrayList in reverse order using ListIterator
    public static void printArrayList(ArrayList arrayList){
        // ListIterator starts at the end of the ArrayList
        ListIterator<Integer> al = arrayList.listIterator(arrayList.size());
        System.out.println("Reversed array list:");

        // Iterate through the list in reverse using hasPrevious() and previous()
        while(al.hasPrevious()){
            // Print each element in reverse order
            System.out.print(al.previous());
        }
        System.out.println();  // Move to the next line after printing all elements
    }

    // Method to print LinkedList in reverse order using ListIterator
    public static void printLinkedList(LinkedList linkedList){
        // ListIterator starts at the end of the LinkedList
        ListIterator<Integer> al = linkedList.listIterator(linkedList.size());
        System.out.println("Reversed linked list:");

        // Iterate through the list in reverse using hasPrevious() and previous()
        while(al.hasPrevious()){
            // Print each element in reverse order
            System.out.print(al.previous());
        }
    }

    public static void main(String[] args) {
        // Step 1: Create and populate an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Step 2: Call the method to print the ArrayList in reverse
        printArrayList(arrayList);

        // Step 3: Create and populate a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Step 4: Call the method to print the LinkedList in reverse
        printLinkedList(linkedList);
    }
}
