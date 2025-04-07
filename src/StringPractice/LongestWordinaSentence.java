package StringPractice;
import java.util.*;
public class LongestWordinaSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] words=str.split(" ");
        String longstring="";
        for(int i=0;i<words.length;i++){
            if(longstring.length()<words[i].length()){
                longstring=words[i];
            }
        }
        System.out.println(longstring);
    }
}
