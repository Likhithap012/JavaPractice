package com.gevernova.objectrelationshipsandcommunication.schoolsystem;

import java.util.ArrayList;
import java.util.List;

// Renamed School to SchoolInstitution
class SchoolInstitution {
    String schoolName;
    List<SchoolStudent> students = new ArrayList<>();

    SchoolInstitution(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(SchoolStudent student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("Students of " + schoolName + ":");
        for (SchoolStudent s : students) {
            System.out.println("- " + s.name);
        }
    }
}
