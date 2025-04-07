package StringPractice;
import java.util.*;
public class RemoveaSpecificCharacterfromaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char remove=sc.nextLine().charAt(0);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
