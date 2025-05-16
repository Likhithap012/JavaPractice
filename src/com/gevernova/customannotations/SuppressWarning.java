package com.gevernova.customannotations;

import java.util.ArrayList;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();  // Using raw type (no generics)
        rawList.add("Hello");
        rawList.add(123);

        ArrayList<String> stringList = rawList;  // Unsafe cast, usually warns

        for (String s : stringList) {
            System.out.println(s);  // Runtime error if non-String element exists
        }
    }
}
