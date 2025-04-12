package com.gevernova.classandobject.levelone.bookdetails;

//Create Book class
class Book {
    String title;
    String author;
    int price;

    //Display the details
    void display() {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }

}
