package com.gevernova.inheritance.singleinheritance.librarymanagement;

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio; // ✅ Add this line to set the bio
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Optional: Reuse the base display
        System.out.println("Author Name: " + this.name);
        System.out.println("Bio: " + this.bio);
    }
}
