package com.gevernova.objectrelationshipsandcommunication.universitymanagement;

import java.util.ArrayList;
import java.util.List;

// Student class
class UniStudent {
    String name;
    List<UniCourse> enrolledCourses = new ArrayList<>();

    UniStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniCourse course) {
        enrolledCourses.add(course);
        course.addStudent(this);  // establish reverse association
        System.out.println(name + " enrolled in " + course.courseName);
    }

    void viewCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (UniCourse c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

