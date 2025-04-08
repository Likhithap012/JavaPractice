package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=-1;
        while(n>0){
             r=(n*(n+1))/2;
             break;
        }
        System.out.println(r);
    }
}
