package com.gevernova.generics.aidrivenresume;

// Abstract base class for all job roles
abstract class JobRole {
    protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    // Abstract method each job role must implement
    public abstract void evaluateResume();
}

