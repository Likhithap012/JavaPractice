package StringPractice;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        int[] count = new int[256];
        boolean isAnagram = true;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }

            for (int c : count) {
                if (c != 0) {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }

        if (isAnagram) {
            System.out.println("Yes, the strings are anagrams.");
        } else {
            System.out.println("No, the strings are not anagrams.");
        }
    }
}
