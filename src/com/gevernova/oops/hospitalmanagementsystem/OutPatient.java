package com.gevernova.oops.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

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
