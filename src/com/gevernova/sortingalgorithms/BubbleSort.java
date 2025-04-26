package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int [] arr,int size){
        for(int i=size-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size= scanner.nextInt();
        int [] marks=new int[size];
        for(int i=0;i<size;i++){
            marks[i]= scanner.nextInt();
        }
        bubbleSort(marks,size);
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
