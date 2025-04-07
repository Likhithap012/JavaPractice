package secondweekleveltwo;

import java.util.Scanner;

public class DisplayVowelsAndConstants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int vo=0;
        int co=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(Character.isLetter(c)){
                c=Character.toLowerCase(c);
                if(c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    System.out.println(c+" is vowel");
                }else{
                    System.out.println(c+" is constant");
                }
            }
            else{
                System.out.println(c+"is not a character");
            }
        }

    }
}
