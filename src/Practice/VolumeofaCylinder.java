package Practice;
import java.util.*;
public class VolumeofaCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double Volume = Math.PI * radius*radius * height;
        System.out.println(Volume);
    }
}
