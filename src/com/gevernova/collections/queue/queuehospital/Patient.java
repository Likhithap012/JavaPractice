package com.gevernova.collections.queue.queuehospital;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient other) {
        return other.severity - this.severity; // High severity = high priority
    }

    public String toString() {
        return name + " (" + severity + ")";
    }
}
