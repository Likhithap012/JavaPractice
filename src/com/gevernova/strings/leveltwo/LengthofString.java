package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class LengthofString {
    public static int fsl(String str){
        int count =0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string= scanner.next();
        int b=fsl(string);
        int c=string.length();
        System.out.println(b);
        System.out.println(c);


    }

}
