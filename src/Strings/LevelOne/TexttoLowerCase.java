package Strings.LevelOne;
import java.util.*;
public class TexttoLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder customLower = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('a' + (ch - 'A'));;
            }
            customLower.append(ch);
        }
        String builtInLower = input.toLowerCase();
        boolean isEqual = customLower.toString().equals(builtInLower);
        System.out.println("Custom Uppercase: " + customLower);
        System.out.println("Built-in Uppercase: " + builtInLower);
        System.out.println("Both methods produce the same result: " + isEqual);

    }
}
