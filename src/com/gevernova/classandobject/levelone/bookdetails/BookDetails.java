package com.gevernova.classandobject.levelone.bookdetails;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Book book=new Book();//Create object for book
        Scanner scanner =new Scanner(System.in);
        //Getting the details form user
        System.out.println("Enter title:");
        book.title= scanner.nextLine();
        System.out.println("Enter author:");
        book.author= scanner.nextLine();
        System.out.println("Enter price:");
        book.price= scanner.nextInt();
        //displaying the details
        book.display();

    }
}
