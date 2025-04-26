package com.gevernova.generics.aidrivenresume;

import java.util.*;

public class ResumeScreeningDemo {
    public static void main(String[] args) {
        // Create individual resumes
        Resume<SoftwareEngineer> sdeResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"));

        // Individual screening
        ResumeScreeningSystem.screenResume(sdeResume);
        ResumeScreeningSystem.screenResume(dsResume);
        ResumeScreeningSystem.screenResume(pmResume);

        // Bulk screening using wildcard method
        List<JobRole> resumes = Arrays.asList(
                new SoftwareEngineer("David"),
                new DataScientist("Eva"),
                new ProductManager("Frank")
        );

        ResumeScreeningSystem.bulkScreen(resumes);
    }
}

