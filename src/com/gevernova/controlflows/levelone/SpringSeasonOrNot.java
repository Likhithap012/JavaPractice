package com.gevernova.controlflows.levelone;

import java.util.Scanner;

public class SpringSeasonOrNot {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int month= scanner.nextInt();
        int day= scanner.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}
