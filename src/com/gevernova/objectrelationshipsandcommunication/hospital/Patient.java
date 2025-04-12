package com.gevernova.objectrelationshipsandcommunication.hospital;

import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    String name;
    List<Doctor> consultedDoctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    void showConsultedDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}
