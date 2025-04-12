package com.gevernova.inheritance.multilevelinheritance.educationalcoursehierarchy;

class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Coursera", true, 4000.0, 20.0);

        poc.displayCourseInfo();
    }
}
