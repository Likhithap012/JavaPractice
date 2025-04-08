package com.gevernova.methods.levelone;

import java.util.Scanner;

public class MaximumNumberOfHandshakes {
    public static int numberOfHandshakes(int n){
        int ans=(n*(n+1))/2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Taking n input from the user
        int n = sc.nextInt();
        int ans=numberOfHandshakes(n);
        System.out.println(ans);
    }
}
