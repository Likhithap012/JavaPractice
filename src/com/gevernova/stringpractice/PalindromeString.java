package com.gevernova.stringpractice;

import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str= scanner.nextLine();
        int length =str.length();
        String ans="";
        for(int i = 0; i< length /2; i++){
            if(str.charAt(i)==str.charAt(length -1-i)){
                ans="yes";
            }else{
                ans="no";
            }
        }
        System.out.println(ans);
    }
}
