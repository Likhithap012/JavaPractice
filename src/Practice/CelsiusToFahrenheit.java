package Practice;
import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Celsius =sc.nextInt();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}
