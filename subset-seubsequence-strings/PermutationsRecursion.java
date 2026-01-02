public class PermutationsRecursion {
    public static void main(String[] args) {
        String str = "abc";
        String processed = "";

        permutations(processed, str);
    }

    static void permutations(String processed, String unprocessed) {

        if (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <= processed.length(); i++) {
            String newProcessed = processed.substring(0, i) + unprocessed.charAt(0) + processed.substring(i);
            
            permutations(newProcessed, unprocessed.substring(1));

        }
    }
}
