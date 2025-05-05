package com.gevernova.exceptionalhandling;

public class InvalidAgeException extends Exception{
   public InvalidAgeException(String message){
       super(message);
   }
}
