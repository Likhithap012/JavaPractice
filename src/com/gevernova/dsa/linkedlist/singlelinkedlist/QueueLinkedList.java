package com.gevernova.dsa.linkedlist.singlelinkedlist;

class QueueLinkedList {
    private Node front, rear;

    // Node class representing each element of the queue
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize an empty queue
    public QueueLinkedList() {
        front = rear = null;
    }

    // Enqueue operation - add an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode; // If the queue is empty, both front and rear point to the new node
            return;
        }
        rear.next = newNode; // Link the new node to the rear
        rear = newNode; // Update the rear to the new node
    }

    // Dequeue operation - remove and return the front element from the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1; // Return -1 if the queue is empty
        }
        int dequeuedData = front.data;
        front = front.next; // Move the front pointer to the next node

        if (front == null) { // If the queue becomes empty, set rear to null
            rear = null;
        }
        return dequeuedData;
    }

    // Peek operation - view the front element without removing it
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data; // Return the front element
    }

    // Display the elements of the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Should print 10 20 30

        System.out.println("Dequeued element: " + queue.dequeue()); // Should print 10
        queue.display(); // Should print 20 30

        System.out.println("Front element: " + queue.peek()); // Should print 20
    }
}

