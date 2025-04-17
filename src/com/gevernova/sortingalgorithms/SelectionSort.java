package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[]arr,int size) {
        int min=0;
        for(int i=0;i<size-1;i++){
            min=i;
            for(int j=i+1;j<size-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,size);
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
