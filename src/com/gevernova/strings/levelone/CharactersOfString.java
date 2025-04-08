package com.gevernova.strings.levelone;

import java.util.Scanner;
public class CharactersOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int length=str.length();
        for(int i=0;i<length;i++){
            System.out.println(str.charAt(i));
        }
//        System.out.println(str.);
        char[] str2=str.toCharArray();
        for(int i=0;i<length;i++){
            System.out.println(str2[i]);
        }
    }
}
