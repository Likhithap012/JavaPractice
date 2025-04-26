package com.gevernova.generics.aidrivenresume;

// Software Engineer role
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateResume() {
        System.out.println(candidateName + "'s resume screened for Software Engineer: Skills - Java, DSA, System Design.");
    }
}
