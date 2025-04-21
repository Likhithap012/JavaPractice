package com.gevernova.dsa.linkedlist.doublylinkedlist.undoredo;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Add initial text states
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! This is a text editor.");
        editor.addState("Hello, World! This is a text editor. Undo and Redo implemented.");

        // Display the current text state
        editor.displayCurrentState(); // Expected: Hello, World! This is a text editor. Undo and Redo implemented.

        // Undo the last action
        editor.undo(); // Expected: Hello, World! This is a text editor.

        // Redo the last undone action
        editor.redo(); // Expected: Hello, World! This is a text editor. Undo and Redo implemented.

        // Add more states
        editor.addState("New state added.");
        editor.addState("Another state added.");

        // Display the current text state
        editor.displayCurrentState(); // Expected: Another state added.

        // Display all text states
        editor.displayHistory();
    }
}

