package com.gevernova.controlflows.leveltwo;

import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double base= scanner.nextInt();
        double expo= scanner.nextInt();
        double power=Math.pow(base,expo);
        System.out.println(power);

    }
}
