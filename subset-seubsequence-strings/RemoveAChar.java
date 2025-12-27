/*
Given a String [str] and a character [ch] , print a string not contaning the [ch] in the [str].

"aabc" & 'b' ---> "aaac"
"aryan gupta" & 'a' ---> "ryn gupt"
*/


public class RemoveAChar {
    public static void main(String[] args) {
        String str = "aryan gupta";

        System.out.println(removeChar(str, 'a'));
    }

    static String removeChar(String str, char ch) {
        if (str.length() == 0)
            return "";

        String ans = "";

        if (str.charAt(0) != ch)
            ans += str.charAt(0);

        return ans + removeChar(str.substring(1), ch);
    }
}
