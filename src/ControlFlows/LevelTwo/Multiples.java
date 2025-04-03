package ControlFlows.LevelTwo;
import java.util.*;
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Taking input and validating if it's a positive integer
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a positive integer.");
                scanner.next(); // Clear the invalid input
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (n <= 0);


        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
