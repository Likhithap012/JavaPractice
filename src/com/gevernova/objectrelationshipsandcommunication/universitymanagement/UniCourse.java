package com.gevernova.objectrelationshipsandcommunication.universitymanagement;

import java.util.ArrayList;
import java.util.List;

// Course class
class UniCourse {
    String courseName;
    UniProfessor professor;
    List<UniStudent> students = new ArrayList<>();

    UniCourse(String courseName) {
        this.courseName = courseName;
    }

    void setProfessor(UniProfessor professor) {
        this.professor = professor;
    }

    void addStudent(UniStudent student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "TBA"));
        System.out.println("Enrolled Students:");
        for (UniStudent s : students) {
            System.out.println("- " + s.name);
        }
    }
}
