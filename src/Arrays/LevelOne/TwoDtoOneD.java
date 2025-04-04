package Arrays.LevelOne;
import java.util.*;
public class TwoDtoOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] twoDArray = new int[rows][cols];
        int[] oneDArray = new int[rows * cols];
        System.out.println("\nEnter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = sc.nextInt();
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
