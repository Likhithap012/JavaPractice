package com.gevernova.objectrelationshipsandcommunication.universitymanagement;

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
