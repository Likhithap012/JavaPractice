package com.gevernova.objectrelationshipsandcommunication;

import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation)
class FacultyMember {
    String name;

    FacultyMember(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Faculty: " + name);
    }
}

// Department class (Composition - tied to University)
class DepartmentUnit {
    String deptName;

    DepartmentUnit(String deptName) {
        this.deptName = deptName;
    }

    void displayInfo() {
        System.out.println("Department: " + deptName);
    }
}

// University class
class University {
    String universityName;
    List<DepartmentUnit> departments = new ArrayList<>();
    List<FacultyMember> facultyList = new ArrayList<>();

    University(String name) {
        this.universityName = name;
    }

    void addDepartment(String deptName) {
        departments.add(new DepartmentUnit(deptName));
    }

    void addFaculty(FacultyMember faculty) {
        facultyList.add(faculty);
    }

    void showUniversityInfo() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");
        for (DepartmentUnit d : departments) {
            d.displayInfo();
        }

        System.out.println("Faculty Members:");
        for (FacultyMember f : facultyList) {
            f.displayInfo();
        }
    }

    void deleteUniversity() {
        // Composition: deleting university deletes departments
        departments.clear();
        System.out.println("\nUniversity " + universityName + " is deleted. All departments removed.");
    }
}

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

