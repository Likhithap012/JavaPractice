package Strings.LevelTwo;

import java.util.*;

public class LengthofString {
    public static int fsl(String str){
        int cnt=0;
        try{
            while(true){
                str.charAt(cnt);
                cnt++;
            }
        }catch(IndexOutOfBoundsException e){
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=fsl(a);
        int c=a.length();
        System.out.println(b);
        System.out.println(c);


    }

}
