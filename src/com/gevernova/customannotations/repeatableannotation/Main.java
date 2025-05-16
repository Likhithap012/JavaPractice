package com.gevernova.customannotations.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("process");

        if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {
            BugReport[] reports = method.getAnnotationsByType(BugReport.class);
            for (BugReport report : reports) {
                System.out.println("Bug: " + report.description());
            }
        }

        new BugTracker().process();
    }
}

