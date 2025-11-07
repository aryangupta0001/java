import java.util.ArrayList;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        
        ArrayList <Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        Scanner Sc = new Scanner(System.in);
        
        int count = 0;

        String str = Sc.nextLine();
        Sc.close();

        for(int i = 0; i<str.length(); i++){
            if(vowels.contains(Character.toLowerCase(str.charAt(i))))
                count++;
        }

        System.out.println(count);
    }
}