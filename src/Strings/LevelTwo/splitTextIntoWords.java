package Strings.LevelTwo;

import java.util.*;

public class splitTextIntoWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
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
