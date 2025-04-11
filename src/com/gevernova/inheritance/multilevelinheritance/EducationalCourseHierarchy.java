package com.gevernova.inheritance.multilevelinheritance;



// Base class: Course
class Course {
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// First subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Second subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: ₹" + calculateFinalFee());
    }
}

class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Coursera", true, 4000.0, 20.0);

        poc.displayCourseInfo();
    }
}
