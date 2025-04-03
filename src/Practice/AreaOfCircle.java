package Practice;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double Area = Math.PI*radius*radius;
        System.out.println(Area);
    }
}
