package com.gevernova.sortingalgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int []empId,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(empId,low,mid);
        mergeSort(empId, mid+1, high);
        merge(empId,low,mid,high);
    }
    public static void merge(int []empId,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(empId[left]<=empId[right]){
                temp.add(empId[left]);
                left++;
            }
            else{
                temp.add(empId[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(empId[left]);
            left++;
        }
        while(right<=high){
            temp.add(empId[right]);
            right++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] empId =new int[size];
        for(int i=0;i<size;i++){
            empId[i]=sc.nextInt();
        }
        mergeSort(empId,0,size-1);
        for(int i=0;i<size;i++){
            System.out.println(empId[i]);
        }
    }
}
