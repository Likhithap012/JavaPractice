package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class PositiveNegativeOrZeroOfNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >0){
            System.out.println("n is positive");
        }
        else if(number <0){
            System.out.println("n is negative");
        }else{
            System.out.println("n is zero");
        }
    }
}
