package com.gevernova.stringpractice;

import java.util.Scanner;
public class LongestWordinaSentence {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str= scanner.nextLine();
        String [] words=str.split(" ");
        String longstring="";
        for(int i=0;i<words.length;i++){
            if(longstring.length()<words[i].length()){
                longstring=words[i];
            }
        }
        System.out.println(longstring);
    }
}
