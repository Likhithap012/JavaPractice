package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class SumOfnNaturalNumberUsingFor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int result =-1;
        int sumLoop=0;
        if(number <=0){
            System.out.println("negative number");
        }
        else{
            result =(number *(number +1))/2;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }
        }
        if(result ==sumLoop){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
    }
}
