package com.gevernova.objectrelationshipsandcommunication;

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

// Main class
class UniversityManagementDemo {
    public static void main(String[] args) {
        // Create students
        UniStudent s1 = new UniStudent("Likhitha");
        UniStudent s2 = new UniStudent("Ananya");

        // Create professor
        UniProfessor p1 = new UniProfessor("Dr. Rao");

        // Create courses
        UniCourse c1 = new UniCourse("Data Structures");
        UniCourse c2 = new UniCourse("Operating Systems");

        // Assign professor to courses
        p1.assignProfessor(c1);
        p1.assignProfessor(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        // View details
        System.out.println();
        c1.showCourseInfo();
        System.out.println();
        c2.showCourseInfo();
        System.out.println();
        s1.viewCourses();
        p1.viewTeachingCourses();
    }
}

