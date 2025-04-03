package ControlFlows.LevelTwo;
import java.util.*;
public class MultiplesOfaNumberUsingwhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiple = number;
        while (multiple < 100) {
            System.out.print(multiple + " ");
            multiple += number; // Increment by the number itself
        }
    }
}
