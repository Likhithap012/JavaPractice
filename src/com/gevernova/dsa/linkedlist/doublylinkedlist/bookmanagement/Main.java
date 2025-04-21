package com.gevernova.dsa.linkedlist.doublylinkedlist.bookmanagement;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 102, false);
        library.addAtPosition(2, "To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true);

        library.displayForward();
        System.out.println("\n🔍 Searching by Author:");
        library.searchByTitleOrAuthor("Harper Lee");

        System.out.println("\n📝 Updating availability of Book ID 102:");
        library.updateAvailability(102, true);

        System.out.println("\n📕 Display Reverse Order:");
        library.displayReverse();

        System.out.println("\n❌ Removing Book ID 103:");
        library.removeByBookId(103);

        System.out.println("\n📚 Total Books: " + library.countBooks());
    }
}

