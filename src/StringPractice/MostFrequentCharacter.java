package StringPractice;
import java.util.*;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char mostFrequent = ' ';
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }
        System.out.println("Most frequent character: " + mostFrequent);
    }
}
