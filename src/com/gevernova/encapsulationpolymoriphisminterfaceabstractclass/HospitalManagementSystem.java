package com.gevernova.encapsulationpolymoriphisminterfaceabstractclass;

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

// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory("InPatient: " + record);
    }

    public void viewRecords() {
        System.out.println("In-Patient Medical Records:");
        for (String rec : records) {
            System.out.println("- " + rec);
        }
    }
}

// OutPatient subclass
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory("OutPatient: " + record);
    }

    public void viewRecords() {
        System.out.println("Out-Patient Medical Records:");
        for (String rec : records) {
            System.out.println("- " + rec);
        }
    }
}

// Main Class
public class HospitalManagementSystem {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: ₹" + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }

        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        InPatient inPatient = new InPatient(101, "Aarav", 45, "Appendicitis", 5, 3000.0);
        inPatient.addRecord("Admitted on 1st April");
        inPatient.addRecord("Surgery successful");

        OutPatient outPatient = new OutPatient(102, "Sana", 29, "Fever", 500.0);
        outPatient.addRecord("Visited on 3rd April");
        outPatient.addRecord("Prescribed medication");

        // Polymorphic processing
        processPatient(inPatient);
        processPatient(outPatient);
    }
}

