package com.gevernova.dsa.binarysearch;

import java.util.Scanner;

public class RotatedSortedelement {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        int size = scanner.nextInt();

        // Declare and initialize the array with the given size
        int[] array = new int[size];

        // Read elements into the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int low=0;
        int high=size-1;
        while(low<high){
            int mid=(low+high)/2;
            if(array[mid]> array[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        System.out.println(low);
        System.out.println(array[low]);
    }
}
