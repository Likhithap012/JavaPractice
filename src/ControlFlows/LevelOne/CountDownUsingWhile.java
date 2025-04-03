package ControlFlows.LevelOne;

import java.util.Scanner;

public class CountDownUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            System.out.println(n);
            n--;
        }

    }
}
