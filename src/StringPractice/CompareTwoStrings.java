package StringPractice;
import java.util.*;
public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        boolean areEqual = true;
        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                System.out.println(str1 + " comes before " + str2);
                areEqual = false;
                break;
            } else if (ch1 > ch2) {
                System.out.println(str2 + " comes before " + str1);
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            if (len1 == len2) {
                System.out.println("Both strings are equal.");
            } else if (len1 < len2) {
                System.out.println(str1 + " comes before " + str2);
            } else {
                System.out.println(str2 + " comes before " + str1);
            }
        }

    }
}
