package ControlFlows.LevelOne;

import java.util.Scanner;

public class SumOfnNaturalNumberUsingFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=-1;
        int sumLoop=0;
        if(n<=0){
            System.out.println("negative number");
        }
        else{
            r=(n*(n+1))/2;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
        }
        if(r==sumLoop){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
    }
}
