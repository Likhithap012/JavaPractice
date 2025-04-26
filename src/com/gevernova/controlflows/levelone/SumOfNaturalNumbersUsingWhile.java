package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int temp =-1;
        while(number >0){
             temp =(number *(number +1))/2;
             break;
        }
        System.out.println(temp);
    }
}
