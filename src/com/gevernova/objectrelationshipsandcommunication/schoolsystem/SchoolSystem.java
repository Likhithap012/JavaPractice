package com.gevernova.objectrelationshipsandcommunication.schoolsystem;

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        // Create school
        SchoolInstitution school = new SchoolInstitution("Green Valley High School");

        // Create students
        SchoolStudent studentOne = new SchoolStudent("Likhitha");
        SchoolStudent studentTwo = new SchoolStudent("Ananya");

        // Add students to school
        school.addStudent(studentOne);
        school.addStudent(studentTwo);

        // Create courses
        LearningCourse math = new LearningCourse("Mathematics");
        LearningCourse science = new LearningCourse("Science");

        // Enroll students
        studentOne.enrollInCourse(math);
        studentOne.enrollInCourse(science);
        studentTwo.enrollInCourse(math);

        // Display student and course info
        studentOne.showCourses();
        studentTwo.showCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();

        school.showAllStudents();
    }
}

