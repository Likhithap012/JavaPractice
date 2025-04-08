package com.gevernova.stringpractice;

import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String ans="";
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                ans="yes";
            }else{
                ans="no";
            }
        }
        System.out.println(ans);
    }
}
