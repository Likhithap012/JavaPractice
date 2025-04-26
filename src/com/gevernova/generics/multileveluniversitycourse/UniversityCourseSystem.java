package com.gevernova.generics.multileveluniversitycourse;


import java.util.ArrayList;
import java.util.List;

public class UniversityCourseSystem {
    public static void main(String[] args) {
        // Creating courses of different types
        ExamCourse math = new ExamCourse("Advanced Mathematics", 4);
        AssignmentCourse design = new AssignmentCourse("UI/UX Design", 3);
        ResearchCourse ai = new ResearchCourse("AI Research", 5);

        // Generic course wrappers
        Course<ExamCourse> mathCourse = new Course<>(math, "Mathematics");
        Course<AssignmentCourse> designCourse = new Course<>(design, "Design");
        Course<ResearchCourse> aiCourse = new Course<>(ai, "Computer Science");

        // Display individual course details
        mathCourse.showDetails();
        designCourse.showDetails();
        aiCourse.showDetails();

        // Wildcard: Store all types in one list
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math);
        allCourses.add(design);
        allCourses.add(ai);

        System.out.println("\n--- Display All Courses using Wildcard ---");
        CourseUtils.displayAllCourses(allCourses);
    }
}
