package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int result[]=new int[11];
        int count =11;
        int sum=0;
        for(int i=0;i<result.length;i++){
            result[i]= scanner.nextInt();
            sum+=result[i];
        }
        int mean=sum/ count;
        System.out.println(mean);
    }
}
