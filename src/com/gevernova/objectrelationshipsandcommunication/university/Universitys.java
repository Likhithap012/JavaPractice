package com.gevernova.objectrelationshipsandcommunication.university;

// Main class
class Universitys {
    public static void main(String[] args) {
        // Create Faculty Members (aggregation)
        FacultyMember f1 = new FacultyMember("Dr. Likhitha");
        FacultyMember f2 = new FacultyMember("Prof. Ananya");

        // Create University
        University uni = new University("Global Tech University");

        // Add Departments (composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Electrical Engineering");

        // Add Faculty Members (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Display info
        uni.showUniversityInfo();

        // Delete University (only departments are deleted)
        uni.deleteUniversity();

        // Faculty members still exist independently
        System.out.println("\nFaculty still exist after university deletion:");
        f1.displayInfo();
        f2.displayInfo();
    }
}
