package com.gevernova.objectrelationshipsandcommunication.university;

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
