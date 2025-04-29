package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Anikit","Ani","Akansha","likhitha","vyshnavi");
        List<String>listTwo=list.stream().map(x->x.toUpperCase()).filter(x->x.charAt(0)=='A').collect(Collectors.toList());
        System.out.println(listTwo);
    }
}
