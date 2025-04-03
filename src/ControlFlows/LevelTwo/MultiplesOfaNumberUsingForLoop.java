package ControlFlows.LevelTwo;
import java.util.*;
public class MultiplesOfaNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i < 100; i += number) {
            System.out.print(i + " ");
        }
    }
}
