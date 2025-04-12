package com.gevernova.objectrelationshipsandcommunication.universitymanagement;

import java.util.ArrayList;
import java.util.List;

// Professor class
class UniProfessor {
    String name;
    List<UniCourse> teachingCourses = new ArrayList<>();

    UniProfessor(String name) {
        this.name = name;
    }

    void assignProfessor(UniCourse course) {
        teachingCourses.add(course);
        course.setProfessor(this);  // assign professor to course
        System.out.println(name + " assigned to teach " + course.courseName);
    }

    void viewTeachingCourses() {
        System.out.println(name + " is teaching:");
        for (UniCourse c : teachingCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}
