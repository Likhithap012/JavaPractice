package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial =1;
        for(int i = 1; i<= number; i++){
            factorial = factorial *i;
        }
        System.out.println(factorial);

    }
}
