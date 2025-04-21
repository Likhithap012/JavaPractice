package com.gevernova.dsa.linkedlist.doublylinkedlist.undoredo;

public class TextEditor {
    private TextState currentState;  // Current state of the text
    private int maxHistorySize = 10; // Maximum number of states to keep in history
    private int historySize = 0;     // Current number of states in history
    private TextState head;          // Head of the doubly linked list (oldest state)
    private TextState tail;          // Tail of the doubly linked list (newest state)

    // Add a new state to the text editor
    public void addState(String text) {
        TextState newState = new TextState(text);

        if (historySize == 0) {
            // First state
            head = tail = currentState = newState;
        } else {
            // Add new state at the end
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            currentState = tail;
        }

        // Ensure history size does not exceed maxHistorySize
        if (historySize == maxHistorySize) {
            // Remove the oldest state (head)
            head = head.next;
            head.prev = null;
        } else {
            historySize++;
        }
    }

    // Undo the action (go to the previous state)
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.text);
        } else {
            System.out.println("No more states to undo.");
        }
    }

    // Redo the action (go to the next state)
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.text);
        } else {
            System.out.println("No more states to redo.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.text);
        } else {
            System.out.println("No current state.");
        }
    }

    // Display all the states from the head (oldest) to the tail (newest)
    public void displayHistory() {
        TextState temp = head;
        System.out.println("Text History:");
        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.next;
        }
    }
}

