package com.gevernova.objectrelationshipsandcommunication.hospital;

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
