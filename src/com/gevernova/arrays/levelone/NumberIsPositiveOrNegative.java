package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class NumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number[]=new int[5];
        for(int i=0;i<5;i++){
            number[i]= scanner.nextInt();
        }
        for(int i=0;i<5;i++){
            if(number[i]>0){
                System.out.println(number[i]+" Positive number");
            }else if(number[i]<0){
                System.out.println(number[i]+" Negative number");
            }else{
                System.out.println(number[i]+" is Zero");
            }
        }
    }
}
