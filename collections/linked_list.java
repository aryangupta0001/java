import java.util.LinkedList;
import java.util.List;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println(list);
        
        list.addLast(5);
        
        System.out.println(list);
    }
}
