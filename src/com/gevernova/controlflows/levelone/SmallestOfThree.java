package com.gevernova.controlflows.levelone;

import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String []arg){
        Scanner scanner =new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if(firstNumber < secondNumber){
            if(firstNumber < thirdNumber){
                System.out.println(" first number is smallest of the 3 numbers");
            }
        }
        else{
            System.out.println("first number is not smallest of the 3 numbers");
        }
    }
}


