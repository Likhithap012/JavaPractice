package StringPractice;
import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowels=0;
        int constant=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }
                constant++;
            }
        }
        System.out.println(vowels);
        System.out.println(constant);
    }
}
