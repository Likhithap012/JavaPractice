package ControlFlows.LevelOne;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }

}
