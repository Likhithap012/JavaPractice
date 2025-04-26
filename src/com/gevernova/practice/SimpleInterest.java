package com.gevernova.practice;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int Principal= scanner.nextInt();
        int Rate= scanner.nextInt();
        int Time= scanner.nextInt();
        int simpleinterest=(Principal*Rate*Time) / 100;
        System.out.println(simpleinterest);
    }
}
