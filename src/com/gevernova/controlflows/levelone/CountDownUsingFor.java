package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class CountDownUsingFor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = number; i>0; i--){
            System.out.println(i);
        }
    }
}
