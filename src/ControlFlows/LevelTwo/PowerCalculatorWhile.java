package ControlFlows.LevelTwo;

import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent (non-negative integer): ");
        int expo = sc.nextInt();
        if (expo < 0) {
            System.out.println("Exponent should be a non-negative integer.");
        } else {
            long result = 1;
            int count = 0;
            while (count < expo) {
                result *= base;
                count++;
            }
            System.out.println(base + " raised to the power " + expo + " is: " + result);
        }

        sc.close();
    }
}
