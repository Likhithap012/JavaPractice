package com.gevernova.exceptionalhandling;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}
