package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial =1;
        while(number >0){
            factorial = factorial * number;
            number--;
        }
        System.out.println(factorial);
    }
}
