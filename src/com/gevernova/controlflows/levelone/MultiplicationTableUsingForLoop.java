package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class MultiplicationTableUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(n*i);
        }
    }
}
