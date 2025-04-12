package com.gevernova.designprinciples.schoolresults;

import java.util.List;

// Student class contains information about a student and their list of subjects
public class Student {
    private String name;
    private int rollNo;
    private List<Subject> subjects;

    // Constructor to initialize student name, roll number, and subject list
    public Student(String name, int rollNo, List<Subject> subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Setter for student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for roll number
    public int getRollNo() {
        return rollNo;
    }

    // Setter for roll number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Setter for list of subjects
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

