package ControlFlows.LevelOne;
import java.util.*;
public class SumofnNaturalNumbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println(n +" is a natural number");
        }
        else{
            System.out.println(n+ "is not a natural number");
        }
        int r=(n*(n+1))/2;
        System.out.println(r);
    }
}
