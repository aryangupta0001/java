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

        if (processed.length() == 0){
            processed = unprocessed.substring(0, 1);
            unprocessed = unprocessed.substring(1);
        }

        for (int i = 0; i < processed.length() + 1; i++) {
            String newProcessed = processed.substring(0, i) + unprocessed.charAt(0) + processed.substring(i);
            String newUnprocessed = "";

            if (unprocessed.length() > 1)
                newUnprocessed = unprocessed.substring(1);

            permutations(newProcessed, newUnprocessed);

        }
    }
}
