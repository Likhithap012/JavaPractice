package com.gevernova.objectrelationshipsandcommunication;



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

// Hospital class
class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void displayWelcomeMessage() {
        System.out.println("Welcome to " + hospitalName + " Hospital\n");
    }
}

// Main class
 class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare");
        hospital.displayWelcomeMessage();

        // Create doctors
        Doctor doc1 = new Doctor("Rahul");
        Doctor doc2 = new Doctor("Sneha");

        // Create patients
        Patient pat1 = new Patient("Likhitha");
        Patient pat2 = new Patient("Ananya");

        // Consultations
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        // Show consultation lists
        System.out.println();
        doc1.showPatients();
        doc2.showPatients();

        System.out.println();
        pat1.showConsultedDoctors();
        pat2.showConsultedDoctors();
    }
}

