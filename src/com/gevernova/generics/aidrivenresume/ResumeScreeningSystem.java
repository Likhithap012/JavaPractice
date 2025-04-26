package com.gevernova.generics.aidrivenresume;

import java.util.List;

class ResumeScreeningSystem {

    // Wildcard method to screen resumes for multiple job roles
    public static void bulkScreen(List<? extends JobRole> resumes) {
        System.out.println("\n--- Bulk Resume Screening ---");
        for (JobRole resume : resumes) {
            resume.evaluateResume();
        }
    }

    // Generic method for individual screening
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("\n--- Individual Resume Screening ---");
        resume.process();
    }
}

