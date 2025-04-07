package ProblemStatements;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!guessedCorrectly && low <= high) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low', 'high', or 'correct': ");
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                guessedCorrectly = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'low', 'high', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Something went wrong. Were you honest? 😅");
        }
    }
}
