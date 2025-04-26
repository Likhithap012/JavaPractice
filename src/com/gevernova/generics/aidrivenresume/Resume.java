package com.gevernova.generics.aidrivenresume;

// Generic Resume class for any JobRole
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void process() {
        jobRole.evaluateResume();  // Delegate to specific role
    }

    public T getJobRole() {
        return jobRole;
    }
}

