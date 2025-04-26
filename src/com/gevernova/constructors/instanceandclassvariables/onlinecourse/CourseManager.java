package com.gevernova.constructors.instanceandclassvariables.onlinecourse;

public class CourseManager {
    public static void main(String[] args) {
        // Creating course objects
        Course courseOne = new Course("Java Programming", 8, 5000);
        Course courseTwo = new Course("Web Development", 12, 7500);

        // Display initial details
        courseOne.displayCourseDetails();
        courseTwo.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("SkillUp Academy");

        // Display updated details
        courseOne.displayCourseDetails();
        courseTwo.displayCourseDetails();
    }
}

