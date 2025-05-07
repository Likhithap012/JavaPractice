package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,15}$");
        String input=scanner.nextLine();
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println(input+" is a vaild Username");
        }else{
            System.out.println(input+" is not a vaild Username");
        }
    }
}
