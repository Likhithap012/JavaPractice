package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class SumofnNaturalNumbers {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >=0){
            System.out.println(number +" is a natural number");
        }
        else{
            System.out.println(number + "is not a natural number");
        }
        int result =(number *(number +1))/2;
        System.out.println(result);
    }
}
