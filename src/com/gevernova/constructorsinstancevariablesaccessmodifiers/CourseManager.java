package com.gevernova.constructorsinstancevariablesaccessmodifiers;

// Class representing an online course
class Course {
    // Instance variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class variable (shared across all Course objects)
    static String instituteName = "TechAcademy";

    // Constructor to initialize instance variables
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println();
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseManager {
    public static void main(String[] args) {
        // Creating course objects
        Course c1 = new Course("Java Programming", 8, 5000);
        Course c2 = new Course("Web Development", 12, 7500);

        // Display initial details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("SkillUp Academy");

        // Display updated details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

