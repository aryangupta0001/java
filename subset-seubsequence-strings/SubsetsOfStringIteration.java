import java.util.ArrayList;
import java.util.List;

public class SubsetsOfStringIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());

        List<List<Integer>> ans = createSubsets(list);

        for (int i = 0; i < ans.size(); i++){
            for (int j = 0; j < ans.get(i).size(); j++)
                System.out.print(ans.get(i).get(j));
            System.out.println("");
        }

    }

    static List<List<Integer>> createSubsets(List<Integer> list) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList<>());

        for (int i : list) {
            int size = ans.size();

            for (int j = 0; j < size; j++) {
                List<Integer> lst = new ArrayList<>(ans.get(j));
                lst.add(i);

                ans.add(lst);
            }
        }
        return ans;
        
    }
}
