package com.gevernova.controlflows.levelthree;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        for(int i=1;i<Math.sqrt(number);i++){
            if(number%i==0){
                sum+=i;
                if(i!=number/i){
                    sum+=number/i;
                }
            }
        }
        if(sum>number){
            System.out.println("This is Abundant Number");
        }else{
            System.out.println("This is not Abundant Number");
        }
    }
}
