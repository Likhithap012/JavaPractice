package com.gevernova.objectrelationshipsandcommunication.university;

import java.util.ArrayList;
import java.util.List;

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

