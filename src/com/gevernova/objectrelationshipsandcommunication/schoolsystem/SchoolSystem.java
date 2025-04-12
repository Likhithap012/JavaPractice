package com.gevernova.objectrelationshipsandcommunication.schoolsystem;

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

