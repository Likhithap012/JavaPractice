package Arrays.LevelOne;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int result[]=new int[11];
        for(int i=1;i<=10;i++){
            result[i]=number*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(result[i]);
        }

    }
}
