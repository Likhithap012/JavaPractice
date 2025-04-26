package com.gevernova.practice;

import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum= numberOne + numberTwo;
        System.out.println("sum:"+sum);
    }
}
