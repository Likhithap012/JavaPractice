package com.gevernova.constructors.accessmodifiers.universitymanagementsystem;

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Accessing protected member 'name'
    public void showName() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}
