package com.gevernova.constructors.instanceandclassvariables.onlinecourse;

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

