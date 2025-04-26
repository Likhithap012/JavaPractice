package com.gevernova.objectrelationshipsandcommunication.university;

// Main class
class Universitys {
    public static void main(String[] args) {
        // Create Faculty Members (aggregation)
        FacultyMember facultyMemberOne = new FacultyMember("Dr. Likhitha");
        FacultyMember facultyMemberTwo = new FacultyMember("Prof. Ananya");

        // Create University
        University university = new University("Global Tech University");

        // Add Departments (composition)
        university.addDepartment("Computer Science");
        university.addDepartment("Electrical Engineering");

        // Add Faculty Members (aggregation)
        university.addFaculty(facultyMemberOne);
        university.addFaculty(facultyMemberTwo);

        // Display info
        university.showUniversityInfo();

        // Delete University (only departments are deleted)
        university.deleteUniversity();

        // Faculty members still exist independently
        System.out.println("\nFaculty still exist after university deletion:");
        facultyMemberOne.displayInfo();
        facultyMemberTwo.displayInfo();
    }
}
