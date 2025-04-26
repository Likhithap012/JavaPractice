package com.gevernova.staticthisfinalinstanceof;

public class HospitalManagementSystem {

    static class Patient {
        // Static variables
        static String hospitalName = "CityCare Hospital";
        static int totalPatients = 0;

        // Instance variables
        String name;
        int age;
        String ailment;
        final int patientID; // Final - cannot be changed

        // Constructor using 'this'
        public Patient(String name, int age, String ailment, int patientID) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = patientID;
            totalPatients++; // Increment total patients
        }

        // Static method to get total patients
        public static void getTotalPatients() {
            System.out.println("Total Patients Admitted: " + totalPatients);
        }

        // Display method with instanceof check
        public void displayPatientDetails() {
            if (this instanceof Patient) {
                System.out.println("Hospital Name : " + hospitalName);
                System.out.println("Patient ID    : " + patientID);
                System.out.println("Name          : " + name);
                System.out.println("Age           : " + age);
                System.out.println("Ailment       : " + ailment);
            } else {
                System.out.println("Invalid Patient Object");
            }
        }
    }

    public static void main(String[] args) {
        // Create patients
        Object patientOne = new Patient("Rahul Sharma", 32, "Fever", 101);
        Object patientTwo = new Patient("Sneha Reddy", 45, "Diabetes", 102);
        Object notAPatient = "Just a String";

        // Check and display details only if it's a Patient
        if (patientOne instanceof Patient) {
            ((Patient) patientOne).displayPatientDetails();
        } else {
            System.out.println("p1 is not a Patient.");
        }

        System.out.println();

        if (patientTwo instanceof Patient) {
            ((Patient) patientTwo).displayPatientDetails();
        } else {
            System.out.println("p2 is not a Patient.");
        }

        System.out.println();

        if (notAPatient instanceof Patient) {
            ((Patient) notAPatient).displayPatientDetails();
        } else {
            System.out.println("notAPatient is not a Patient.");
        }

        System.out.println();
        Patient.getTotalPatients();
    }
}

