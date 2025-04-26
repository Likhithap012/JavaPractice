package com.gevernova.generics.multileveluniversitycourse;

class ExamCourse extends CourseType {
    public ExamCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by final exam.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by research paper.");
    }
}

