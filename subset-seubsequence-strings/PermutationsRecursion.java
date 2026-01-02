import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsRecursion {
    public static void main(String[] args) {
        String str = "abc";
        String processed = "";

        System.out.println(permutations(processed, str));
    }

    static List<String> permutations(String processed, String unprocessed) {

        if (unprocessed.length() == 0)
            return new ArrayList<String>(Arrays.asList(processed));

        List<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String newProcessed = processed.substring(0, i) + unprocessed.charAt(0) + processed.substring(i);

            ans.addAll(permutations(newProcessed, unprocessed.substring(1)));
        }

        return ans;
    }
}
