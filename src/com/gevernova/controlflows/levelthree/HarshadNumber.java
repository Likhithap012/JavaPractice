package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if(number%sum==0){
            System.out.println("This is HarshadNumber");
        }
    }
}
