package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicense {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z]{2}[0-9]{4}$");
        Matcher matcher= pattern.matcher(input);
        if(matcher.matches()){
            System.out.println(input+" vaild");
        }
        else{
            System.out.println(input+" not vaild");
        }

    }
}
