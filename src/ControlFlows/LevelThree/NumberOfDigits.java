package ControlFlows.LevelThree;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int cnt=0;
        while(number>0){
            int num=number%10;
            number=number/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
