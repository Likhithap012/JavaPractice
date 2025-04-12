package com.gevernova.designprinciples.schoolresultsapplication;

// GradeCalculator class contains logic to calculate a grade based on subject marks
public class GradeCalculator {

    // Method to calculate grade of a student
    public String calculateGrade(Student student) {
        int total = 0;

        // Loop through all subjects and sum the marks
        for (Subject subject : student.getSubjects()) {
            total += subject.getMarks();
        }

        // Calculate average marks
        double average = total / (double) student.getSubjects().size();

        // Determine grade based on average
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}

