package com.gevernova.dsa.linkedlist.singlelinkedlist;

public class AddANode {

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Adds a new node at the beginning of the list
    public Node addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Adds a new node at the end of the list
    public Node addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Adds a new node after a specific node in the list
    public Node addAfterNode(int tnode, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data == tnode) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // Prints the entire list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AddANode ll = new AddANode();
        ll.addAtFirst(3);
        ll.addAtFirst(4);
        ll.addAtFirst(5);
        ll.addAtLast(6);
        ll.addAfterNode(5, 9);
        ll.print(); // Output the list
    }
}
