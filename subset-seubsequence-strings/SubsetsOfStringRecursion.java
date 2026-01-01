import java.util.ArrayList;
import java.util.List;

public class SubsetsOfStringRecursion {

    public static void main(String[] args) {
    String str = "Aryan";

    ArrayList<String> subsets = new ArrayList<>();

    createSubsets("", str, subsets);

    System.out.println(subsets.size());
    for (String a : subsets)
    System.out.print(a + "\t");
    }

    static void createSubsets(String processed, String unProcessed, List<String>
    subsets) {

    if (unProcessed.length() == 0) {
    subsets.add(processed);
    return;
    }

    createSubsets(processed + unProcessed.charAt(0), unProcessed.substring(1),
    subsets);
    createSubsets(processed, unProcessed.substring(1), subsets);
    }

}
