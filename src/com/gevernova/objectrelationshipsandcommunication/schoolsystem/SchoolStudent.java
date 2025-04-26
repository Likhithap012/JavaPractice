package com.gevernova.objectrelationshipsandcommunication.schoolsystem;

import java.util.ArrayList;
import java.util.List;

// Renamed Student to SchoolStudent
class SchoolStudent {
    String name;
    List<LearningCourse> courses = new ArrayList<>();

    SchoolStudent(String name) {
        this.name = name;
    }

    void enrollInCourse(LearningCourse course) {
        courses.add(course);
        course.enrollStudent(this); // keep both sides updated
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (LearningCourse course : courses) {
            System.out.println("- " + course.courseName);
        }
    }
}
