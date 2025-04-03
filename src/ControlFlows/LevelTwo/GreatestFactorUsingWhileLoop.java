package ControlFlows.LevelTwo;
import java.util.*;
public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1;
        int greatest=1;
        while (i < number) {
            if (number % i == 0) {
                greatest=i;
            }
            i++;
        }
        System.out.println(greatest);
    }
}
