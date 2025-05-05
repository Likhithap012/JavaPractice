package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        try{
            int ans=a/b;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Operation completed");
        }
    }
}
