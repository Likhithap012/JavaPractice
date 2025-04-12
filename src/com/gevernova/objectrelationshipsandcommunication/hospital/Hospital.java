package com.gevernova.objectrelationshipsandcommunication.hospital;

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

