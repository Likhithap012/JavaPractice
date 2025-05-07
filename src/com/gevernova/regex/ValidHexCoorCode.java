package com.gevernova.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexCoorCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("^#[0-9a-zA-Z]{6}$");
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println(input+" vaild");
        }else{
            System.out.println(input+" not vaild");
        }
    }
}
