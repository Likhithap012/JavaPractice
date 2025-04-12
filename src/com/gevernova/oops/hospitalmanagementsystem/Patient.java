package com.gevernova.oops.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Abstract class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Encapsulated sensitive data
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public void addToMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public abstract double calculateBill();
}
