package com.gevernova.dsa.linkedlist.singlelinkedlist.practice;

public class AddOperations {
    public Node head;

    public Node addAtFirst(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node addAfterNode(int targetData, int newData) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == targetData) {
                Node newNode = new Node(newData);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        System.out.println("Target node not found.");
        return head;
    }

    public Node addAtPosition(int pos, int data) {
        if (pos < 0) {
            System.out.println("Invalid position.");
            return head;
        }
        if (pos == 0) return addAtFirst(data);

        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
