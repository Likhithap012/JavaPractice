package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int result[]=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            int number= scanner.nextInt();
            result[i]=number;
            sum+=number;
        }
        for(int i=0;i<10;i++){
            System.out.println(result[i]);
        }
        System.out.println(sum);
    }
}
