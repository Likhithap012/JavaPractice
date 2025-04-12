package com.gevernova.classandobject.levelone.bookdetails;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Book book=new Book();//Create object for book
        Scanner sc=new Scanner(System.in);
        //Getting the details form user
        System.out.println("Enter title:");
        book.title=sc.nextLine();
        System.out.println("Enter author:");
        book.author=sc.nextLine();
        System.out.println("Enter price:");
        book.price= sc.nextInt();
        //displaying the details
        book.display();

    }
}
