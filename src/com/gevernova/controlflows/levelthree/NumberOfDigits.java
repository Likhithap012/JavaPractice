package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count =0;
        while(number>0){
            int num=number%10;
            number=number/10;
            count++;
        }
        System.out.println(count);
    }
}
