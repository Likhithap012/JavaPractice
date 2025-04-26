package com.gevernova.generics.aidrivenresume;

// Data Scientist role
class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateResume() {
        System.out.println(candidateName + "'s resume screened for Data Scientist: Skills - Python, ML, Statistics.");
    }
}
