package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >=18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }

}
