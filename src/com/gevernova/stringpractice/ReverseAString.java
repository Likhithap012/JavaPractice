package com.gevernova.stringpractice;

import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str= scanner.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++){
            newstr=str.charAt(i)+newstr;
        }
        System.out.println(newstr);
    }
}
