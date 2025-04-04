package Arrays.LevelTwo;
import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + friends[i] + "'s age: ");
            ages[i] = sc.nextInt();
            System.out.print("Enter " + friends[i] + "'s height (in cm): ");
            heights[i] = sc.nextInt();
        }
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        System.out.println("\nThe youngest friend is: " + friends[minAgeIndex]);
        System.out.println("The tallest friend is: " + friends[maxHeightIndex]);
    }
}
