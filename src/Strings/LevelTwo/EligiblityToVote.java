package Strings.LevelTwo;
import java.util.*;
public class EligiblityToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        String[][] eligibility = new String[10][2];
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(eligibility[i][0] + "        | " + eligibility[i][1]);
        }

    }
}
