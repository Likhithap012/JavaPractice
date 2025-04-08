package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result[]=new int[11];
        int cnt=11;
        int sum=0;
        for(int i=0;i<result.length;i++){
            result[i]=sc.nextInt();
            sum+=result[i];
        }
        int mean=sum/cnt;
        System.out.println(mean);


    }
}
