package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class MultiplicationFromSixToNine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int result[]=new int[4];
        int j=0;
        for(int i=6;i<=9;i++){
            result[j]=number*i;
            j++;
        }
        for(int i=0;i<4;i++){
            System.out.println(result[i]);
        }

    }
}
