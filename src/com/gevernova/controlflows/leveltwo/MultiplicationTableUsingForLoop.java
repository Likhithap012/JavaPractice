package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;

public class MultiplicationTableUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(number *i);
        }
    }
}
