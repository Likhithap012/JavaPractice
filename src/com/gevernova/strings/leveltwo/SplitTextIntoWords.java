package com.gevernova.strings.leveltwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitTextIntoWords {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input= scanner.nextLine();
        String[] words=input.split("\\s+");
        List<String[]>result=new ArrayList<>();
        for(String word:words){
            result.add(new String[]{word,String.valueOf(word.length())});
        }
        for(String[] pair:result){
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}
