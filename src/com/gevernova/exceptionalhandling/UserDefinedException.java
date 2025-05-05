package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int age= scanner.nextInt();
            AgeValidator.validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
