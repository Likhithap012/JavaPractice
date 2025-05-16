package com.gevernova.customannotations.repeatableannotation;

public class BugTracker {

    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "IndexOutOfBoundsException in edge case")
    public void process() {
        System.out.println("Processing task...");
    }
}

