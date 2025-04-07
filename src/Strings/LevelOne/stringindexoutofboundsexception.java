package Strings.LevelOne;
import java.util.*;
public class stringindexoutofboundsexception {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            System.out.println(str.charAt(10)); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
