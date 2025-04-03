package ControlFlows.LevelOne;
import java.util.*;
public class SmallestOfThree {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println(" first number is smallest of the 3 numbers");
            }
        }
        else{
            System.out.println("first number is not smallest of the 3 numbers");
        }
    }
}


