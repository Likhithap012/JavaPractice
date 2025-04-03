package ControlFlows.LevelTwo;
import java.util.*;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double base= sc.nextInt();
        double expo=sc.nextInt();
        double power=Math.pow(base,expo);
        System.out.println(power);

    }
}
