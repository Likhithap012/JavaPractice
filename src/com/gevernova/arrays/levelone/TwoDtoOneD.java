package com.gevernova.arrays.levelone;

import java.util.Scanner;
public class TwoDtoOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] twoDArray = new int[rows][cols];
        int[] oneDArray = new int[rows * cols];
        System.out.println("\nEnter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }
        for (int value : oneDArray) {
            System.out.print(value + " ");
        }
    }
}
