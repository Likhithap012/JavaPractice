package com.gevernova.practice;

import java.util.Scanner;
public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        System.out.println((numberOne + numberTwo + numberThree)/3);
    }
}
