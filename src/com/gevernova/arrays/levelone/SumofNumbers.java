package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result[]=new int[10];
        int sum=0;
        int cnt=0;
        for(int i=0;i<10;i++){
            int number= sc.nextInt();
            result[i]=number;
            sum+=number;
            cnt++;
        }
        for(int i=0;i<10;i++){
            System.out.println(result[i]);
        }
        System.out.println(sum);
    }
}
