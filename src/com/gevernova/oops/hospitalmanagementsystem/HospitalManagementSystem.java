package com.gevernova.oops.hospitalmanagementsystem;

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

