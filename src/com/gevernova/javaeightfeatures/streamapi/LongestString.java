package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("likhitha","Vyshnavi","Manasa","chaitanya");
        String Longeststr=list.stream().filter(x->x.length()>0).sorted((a,b)->b.length()-a.length()).findFirst().orElse("");
//        0r
//        // Find the longest string using reduce
//        String longestStr = list.stream()
//                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
//                .orElse(""); // Return empty if list is empty
        System.out.println(Longeststr);
    }
}
