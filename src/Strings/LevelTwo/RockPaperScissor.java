package Strings.LevelTwo;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rounds;
        int userWins = 0, computerWins = 0, draws = 0;

        System.out.print("Enter the number of rounds you want to play: ");
        rounds = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] gameResults = new String[rounds][3]; // Stores choices and results

        for (int i = 0; i < rounds; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String computerChoice = getComputerChoice(random);
            String result = findWinner(userChoice, computerChoice);

            if (result.equals("User Wins")) userWins++;
            else if (result.equals("Computer Wins")) computerWins++;
            else draws++;

            // Store results
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = result;
        }

        // Display results
        displayResults(gameResults, userWins, computerWins, draws, rounds);

        scanner.close();
    }

    // Generate computer's choice
    public static String getComputerChoice(Random random) {
        int choice = random.nextInt(3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Determine the winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }

    // Display results and statistics
    public static void displayResults(String[][] results, int userWins, int computerWins, int draws, int rounds) {
        System.out.println("\nGame Results:");
        System.out.println("---------------------------------------------");
        System.out.println("Round  | User Choice | Computer Choice | Result");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "      | " + results[i][0] + "         | " + results[i][1] + "            | " + results[i][2]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("--------------------------------");
        System.out.println("User Wins      : " + userWins);
        System.out.println("Computer Wins  : " + computerWins);
        System.out.println("Draws          : " + draws);

        double userWinPercentage = (userWins * 100.0) / rounds;
        double computerWinPercentage = (computerWins * 100.0) / rounds;

        System.out.println("User Win %     : " + String.format("%.2f", userWinPercentage) + "%");
        System.out.println("Computer Win % : " + String.format("%.2f", computerWinPercentage) + "%");
        System.out.println("--------------------------------");
    }
}
