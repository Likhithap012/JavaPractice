package com.gevernova.customannotations.Annotation;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Likhitha")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}

