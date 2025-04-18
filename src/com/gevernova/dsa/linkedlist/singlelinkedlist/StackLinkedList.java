package com.gevernova.dsa.linkedlist.singlelinkedlist;
class StackLinkedList {
    private Node top; // Top of the stack

    // Node class representing each element of the stack
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize an empty stack
    public StackLinkedList() {
        top = null;
    }

    // Push operation - add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Set the new node's next to the current top
        top = newNode; // Update the top to the new node
    }

    // Pop operation - remove and return the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // Return -1 if the stack is empty
        }
        int poppedData = top.data;
        top = top.next; // Move the top pointer to the next node
        return poppedData;
    }

    // Peek operation - view the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data; // Return the top element
    }

    // Display the elements of the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Should print 30 20 10

        System.out.println("Popped element: " + stack.pop()); // Should print 30
        stack.display(); // Should print 20 10

        System.out.println("Top element: " + stack.peek()); // Should print 20
    }
}

