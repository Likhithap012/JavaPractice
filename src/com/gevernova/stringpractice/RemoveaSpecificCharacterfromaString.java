package com.gevernova.stringpractice;

import java.util.Scanner;
public class RemoveaSpecificCharacterfromaString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        char remove= scanner.nextLine().charAt(0);
        String answer ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                answer +=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
