package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceAndSum {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6);
        int Sum=list.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
        System.out.println(Sum);
    }
}
