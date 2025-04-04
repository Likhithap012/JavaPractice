package Arrays.LevelTwo;
import java.util.*;
public class BmiTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            do {
                System.out.print("Enter height (in meters, positive value): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter weight (in kg, positive value): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid weight! Please enter a positive value.");
                }
            } while (personData[i][1] <= 0);
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "  |  " + personData[i][1] + "  |  " + String.format("%.2f", personData[i][2]) + "  |  " + weightStatus[i]);
        }
    }
}
