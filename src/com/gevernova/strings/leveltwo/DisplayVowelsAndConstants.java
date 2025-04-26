package com.gevernova.strings.leveltwo;

import java.util.Scanner;

public class DisplayVowelsAndConstants {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String number= scanner.nextLine();
        for(int i=0;i<number.length();i++){
            char c=number.charAt(i);
            if(Character.isLetter(c)){
                c=Character.toLowerCase(c);
                if(c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    System.out.println(c+" is vowel");
                }else{
                    System.out.println(c+" is constant");
                }
            }
            else{
                System.out.println(c+"is not a character");
            }
        }

    }
}
