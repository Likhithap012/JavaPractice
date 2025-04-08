package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class EligibilityToVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[10];
        for(int i=0;i< age.length-1;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i< age.length-1;i++){
            if(age[i]>=18){
                System.out.println(age[i]+" is eligible to Vote");
            }else{
                System.out.println(age[i]+" is not eligible to Vote");
            }
        }
    }
}
