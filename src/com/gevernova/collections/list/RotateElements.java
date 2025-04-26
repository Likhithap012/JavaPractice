package com.gevernova.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RotateElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        int size=arrayList.size();
        k=k%size;
        ArrayList<Integer> newlist=new ArrayList<>();
        newlist.addAll(arrayList.subList(k,size));
        newlist.addAll(arrayList.subList(0,k));
        System.out.println(newlist);
    }
}
