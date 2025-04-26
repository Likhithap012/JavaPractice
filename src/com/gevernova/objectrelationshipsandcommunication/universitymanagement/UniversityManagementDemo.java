package com.gevernova.objectrelationshipsandcommunication.universitymanagement;

// Main class
class UniversityManagementDemo {
    public static void main(String[] args) {
        // Create students
        UniStudent studentOne = new UniStudent("Likhitha");
        UniStudent studentTwo = new UniStudent("Ananya");

        // Create professor
        UniProfessor professorOne = new UniProfessor("Dr. Rao");

        // Create courses
        UniCourse courseOne = new UniCourse("Data Structures");
        UniCourse courseTwo = new UniCourse("Operating Systems");

        // Assign professor to courses
        professorOne.assignProfessor(courseOne);
        professorOne.assignProfessor(courseTwo);

        // Students enroll in courses
        studentOne.enrollCourse(courseOne);
        studentTwo.enrollCourse(courseOne);
        studentOne.enrollCourse(courseTwo);

        // View details
        System.out.println();
        courseOne.showCourseInfo();
        System.out.println();
        courseTwo.showCourseInfo();
        System.out.println();
        studentOne.viewCourses();
        professorOne.viewTeachingCourses();
    }
}
