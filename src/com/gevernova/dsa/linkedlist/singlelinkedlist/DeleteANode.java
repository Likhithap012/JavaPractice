package com.gevernova.dsa.linkedlist.singlelinkedlist;

public class DeleteANode {
    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Adds a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Deletes the head node
    public Node deleteHead() {
        if (head == null) return null;
        head = head.next;
        return head;
    }

    // Deletes the tail node
    public Node deleteTail() {
        if (head == null || head.next == null) {
            head = null;
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Deletes a node with specific data
    public Node deleteNode(int tdata) {
        if (head == null) return null;
        if (head.data == tdata) {
            head = head.next;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == tdata) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    // Prints the entire list
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteANode list = new DeleteANode();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print(); // 1 2 3 4 5

        list.deleteHead();
        list.print(); // 2 3 4 5

        list.deleteTail();
        list.print(); // 2 3 4

        list.deleteNode(3);
        list.print(); // 2 4
    }
}
