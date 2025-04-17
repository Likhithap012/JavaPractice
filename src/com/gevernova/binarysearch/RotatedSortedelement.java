package com.gevernova.binarysearch;

import java.util.Scanner;

public class RotatedSortedelement {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the array from the user
        int size = sc.nextInt();

        // Declare and initialize the array with the given size
        int[] arr = new int[size];

        // Read elements into the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int low=0;
        int high=size-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        System.out.println(low);
        System.out.println(arr[low]);
    }
}
