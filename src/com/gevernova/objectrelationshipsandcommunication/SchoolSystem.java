package com.gevernova.objectrelationshipsandcommunication;

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
        for (LearningCourse c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// Renamed School to SchoolInstitution
class SchoolInstitution {
    String schoolName;
    List<SchoolStudent> students = new ArrayList<>();

    SchoolInstitution(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(SchoolStudent student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("Students of " + schoolName + ":");
        for (SchoolStudent s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        // Create school
        SchoolInstitution school = new SchoolInstitution("Green Valley High School");

        // Create students
        SchoolStudent s1 = new SchoolStudent("Likhitha");
        SchoolStudent s2 = new SchoolStudent("Ananya");

        // Add students to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Create courses
        LearningCourse math = new LearningCourse("Mathematics");
        LearningCourse science = new LearningCourse("Science");

        // Enroll students
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        // Display student and course info
        s1.showCourses();
        s2.showCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();

        school.showAllStudents();
    }
}

