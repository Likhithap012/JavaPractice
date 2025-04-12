package com.gevernova.objectrelationshipsandcommunication.schoolsystem;

import java.util.ArrayList;
import java.util.List;

// Renamed Course to LearningCourse
class LearningCourse {
    String courseName;
    List<SchoolStudent> students = new ArrayList<>();

    LearningCourse(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(SchoolStudent student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (SchoolStudent s : students) {
            System.out.println("- " + s.name);
        }
    }
}
