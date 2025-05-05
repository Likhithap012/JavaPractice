package com.gevernova.exceptionalhandling;

import java.util.Scanner;

public class ExceptionPropagation {
    public static void methodTwo(int a,int b){
        methodOne(a,b);
    }
    public static void methodOne(int a,int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        methodTwo(a,b);

    }
}
