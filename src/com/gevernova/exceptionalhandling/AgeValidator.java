package com.gevernova.exceptionalhandling;

public class AgeValidator {

    static  void validateAge(int age) throws InvalidAgeException{
        if(age <18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else{
            System.out.println("Access granted!");
        }
    }
}
