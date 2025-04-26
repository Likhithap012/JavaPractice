package com.gevernova.practice;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int radius= scanner.nextInt();
        double Area = Math.PI*radius*radius;
        System.out.println(Area);
    }
}
