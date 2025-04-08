package com.gevernova.controlflows.levelthree;

import java.util.Scanner;
public class CalculateBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextInt();
        double height = sc.nextInt();
        double bmi=(weight/(height*height));
        if(bmi<=18.4){
            System.out.println("Underweight");
        } else if(bmi>=18.5&&bmi<=24.9){
            System.out.println("Normal");
        }else if(bmi>=25&&bmi<=39.9){
            System.out.println("Overweight");
        }else if(bmi>=40){
            System.out.println("Obese");
        }
    }
}
