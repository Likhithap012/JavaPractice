package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1; i<= number; i++){
            if(i%2==0){
                System.out.println(i+"even");
            }else{
                System.out.println(i+" odd");
            }
        }
    }
}


