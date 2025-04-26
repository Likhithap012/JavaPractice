package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class CountDownUsingWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        while(number >0){
            System.out.println(number);
            number--;
        }

    }
}
