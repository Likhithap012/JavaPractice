package com.gevernova.constructors.instanceandclassvariables.onlinecourse;

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
