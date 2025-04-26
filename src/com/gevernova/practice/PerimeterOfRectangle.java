package com.gevernova.practice;

import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int length= scanner.nextInt();
        int width= scanner.nextInt();
        int perimeter=2*(length + width);
        System.out.println(perimeter);
    }
}
