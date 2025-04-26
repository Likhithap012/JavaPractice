package com.gevernova.generics.multileveluniversitycourse;

public class Course<T extends CourseType> {
    private T courseType;
    private String department;

    public Course(T courseType, String department) {
        this.courseType = courseType;
        this.department = department;
    }

    public void showDetails() {
        System.out.println("Department: " + department + " | Course: " + courseType);
        courseType.evaluate();
    }

    public T getCourseType() {
        return courseType;
    }
}
