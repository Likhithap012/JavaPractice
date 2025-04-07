package StringPractice;
import java.util.*;
public class ToggleCaseofCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mainstr=sc.nextLine();
        String result="";
        for(int i=0;i<mainstr.length();i++){
            char c=mainstr.charAt(i);
            if(Character.isLowerCase(c)){
                result+=Character.toUpperCase(c);
            }
            if(Character.isUpperCase(c)){
                result+=Character.toLowerCase(c);
            }
        }
        System.out.println(result);
    }
}
