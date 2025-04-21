package com.gevernova.dsa.linkedlist.singlelinkedlist.practice;

public class Main {
    public static void main(String[] args) {
        AddOperations adder = new AddOperations();

        adder.addAtFirst(3);
        adder.addAtFirst(4);
        adder.addAtLast(7);
        adder.addAfterNode(4, 9);
        adder.addAtPosition(2, 88);

        System.out.println("List after additions:");
        adder.printList();

        DeleteOperations deleter = new DeleteOperations(adder.head);
        deleter.head = deleter.deleteAtFirst();
        deleter.head = deleter.deleteAtLast();
        deleter.head = deleter.deleteAtPosition(1);

        System.out.println("List after deletions:");
        adder.head = deleter.head;
        adder.printList();
    }
}
