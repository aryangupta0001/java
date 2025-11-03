import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args){
        
        String s1, s2 = "";

        Scanner Sc = new Scanner(System.in);

        s1 = Sc.next();

        Sc.close();

        for (int i = s1.length() - 1; i >= 0; i--)
            s2 = s2 + s1.charAt(i);

        
        if(s1.equals(s2))
            System.out.println("Palindrome");
        
        else
            System.out.println("NOT Palindrome");

    }    
}
