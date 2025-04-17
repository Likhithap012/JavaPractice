package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[]arr,int size){
        for(int i=0;i<size;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] empId =new int[size];
        for(int i=0;i<size;i++){
            empId[i]=sc.nextInt();
        }
        insertionSort(empId,size);
        for(int i=0;i<size;i++){
            System.out.println(empId[i]);
        }
    }
}
