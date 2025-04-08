package com.gevernova.stringpractice;

import java.util.Scanner;
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mainstr=sc.nextLine();
        String substr=sc.nextLine();
        int cnt=0;
        for(int i=0;i<=mainstr.length()-substr.length();i++){
            if(mainstr.substring(i,i+substr.length()).equals(substr)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
