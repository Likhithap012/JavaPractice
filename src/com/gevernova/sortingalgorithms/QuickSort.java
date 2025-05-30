package com.gevernova.sortingalgorithms;

import java.util.Scanner;

public class QuickSort {
    public static int quick(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j) {
            while (arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while(arr[j]>pivot&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSort(int []arr,int low,int high){
        if(low<high){
            int pivot=quick(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size= scanner.nextInt();
        int [] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        quickSort(arr,0,size-1);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
