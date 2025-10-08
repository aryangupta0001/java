import java.util.ArrayList;
import java.util.List;

public class array_list {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(3);
        l1.add(1);
        l1.add(3);
        l1.add(5);

        // System.out.println(l1);

        l1.add(1, 12);

        // System.out.println(l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        // l2.add(101);
        l2.add(103);

        l1.addAll(1, l2); // Adds an ArrrayList to another ArrayList
        // System.out.println(l1);

        // l2.clear();
        // System.out.println(l2.contains(102));

        System.out.println(l1.indexOf(101)); // Returns the index of the first occurence of the element if found, else -1

        // l1.add(4, 101);

        System.out.println(l1.lastIndexOf(101)); // Returns the index of the last occurence of the element if found, else -1

        l1.set(1, 150); // Replaces the element at the specified position with the provided element

        System.out.println(l1);

        l1.remove(2); // remove method removes/deleted the element at the specified position
        System.out.println(l1);

        Integer obj = Integer.valueOf(1);

        l1.remove(Integer.valueOf(obj)); // if any Object is provided in the remove method, it removes that object from
        // l1.remove(Integer.valueOf("1")); // if any Object is provided in the remove method, it removes that object from the ArrayList
        System.out.println(l1);

    }

}