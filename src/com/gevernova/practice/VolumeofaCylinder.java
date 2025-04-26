package com.gevernova.practice;

import java.util.Scanner;
public class VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int radius= scanner.nextInt();
        int height= scanner.nextInt();
        double Volume = Math.PI * radius*radius * height;
        System.out.println(Volume);
    }
}
