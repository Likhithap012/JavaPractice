package com.gevernova.dsa.linkedlist.singlelinkedlist.practice;

public class DeleteOperations {
    public Node head;

    public DeleteOperations(Node head) {
        this.head = head;
    }

    public Node deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        System.out.println("Deleted head: " + head.data);
        head = head.next;
        return head;
    }

    public Node deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (head.next == null) {
            System.out.println("Deleted last node: " + head.data);
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted last node: " + temp.next.data);
        temp.next = null;
        return head;
    }

    public Node deleteAtPosition(int pos) {
        if (head == null || pos < 0) {
            System.out.println("Invalid deletion.");
            return head;
        }
        if (pos == 0) return deleteAtFirst();

        Node temp = head;
        int count = 0;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return head;
        }
        System.out.println("Deleted at position " + pos + ": " + temp.next.data);
        temp.next = temp.next.next;
        return head;
    }
}

