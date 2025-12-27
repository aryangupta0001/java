public class RemoveSubString {
    public static void main(String[] args) {
        String str = "hello world how are you";

        System.out.println(removeSubString(str, "are"));

    }

    static String removeSubString(String str, String sub) {
        if (str.length() <= sub.length())
            return str;

        boolean startsWith = str.substring(0, sub.length()).equals(sub);

        char ans = startsWith ? '\0' : str.charAt(0);

        int start = startsWith ? sub.length() : 1;

        return ans + removeSubString(str.substring(start), sub);

    }
}