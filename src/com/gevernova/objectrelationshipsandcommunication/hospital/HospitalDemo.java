package com.gevernova.objectrelationshipsandcommunication.hospital;

// Main class
class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare");
        hospital.displayWelcomeMessage();

        // Create doctors
        Doctor docterOne = new Doctor("Rahul");
        Doctor docterTwo = new Doctor("Sneha");

        // Create patients
        Patient patientOne = new Patient("Likhitha");
        Patient patientTwo = new Patient("Ananya");

        // Consultations
        docterOne.consult(patientOne);
        docterOne.consult(patientTwo);
        docterTwo.consult(patientOne);

        // Show consultation lists
        System.out.println();
        docterOne.showPatients();
        docterTwo.showPatients();

        System.out.println();
        patientOne.showConsultedDoctors();
        patientTwo.showConsultedDoctors();
    }
}
