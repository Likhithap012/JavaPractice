package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[]arr,int size) {
        int minimum =0;
        for(int i=0;i<size-1;i++){
            minimum =i;
            for(int j=i+1;j<size-1;j++){
                if(arr[j]<arr[minimum]){
                    minimum =j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size= scanner.nextInt();
        int [] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        selectionSort(arr,size);
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
