package com.gevernova.oops.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

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
