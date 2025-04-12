package com.gevernova.objectrelationshipsandcommunication.hospital;

import java.util.ArrayList;
import java.util.List;

// Doctor class
class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting " + patient.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}
