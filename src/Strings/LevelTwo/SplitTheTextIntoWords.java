package Strings.LevelTwo;

import java.util.*;

public class SplitTheTextIntoWords {
    public static int los(String s){
        int length=0;
        for(int i: s.toCharArray()){
            length++;
        }
        return length;
    }
    public static String[] word(String s){
        int length=los(s);
        int sc=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                sc++;
            }
        }
        int [] si=new int[sc+1];
        int index=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)== ' '){
                si[index++]=i;
            }
        }
        si[index]=length;
        String[] words=new String[sc+1];
        int start=0;
        for(int i=0;i<=sc;i++){
            words[i]=s.substring(start,si[i]).trim();
            start=si[i]+1;
        }
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int length=los(input);
        String [] cwords=word(input);
        for(String w:cwords){
            System.out.println(w);
        }
        String[] builtInWords = input.split("\\s+");

        boolean areEqual = compareStringArrays(cwords, builtInWords);

        System.out.println("\nWords from built-in split method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods producing the same result? " + areEqual);
    }
}
