package com.gevernova.designprinciples.schoolresults;

// Subject class represents an academic subject with a name and marks
public class Subject {
    private String name;
    private int marks;

    // Constructor to initialize subject name and marks
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for subject name
    public String getName() {
        return name;
    }

    // Setter for subject name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for subject marks
    public int getMarks() {
        return marks;
    }

    // Setter for subject marks
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

