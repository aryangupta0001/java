import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAPI {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("Aryan");
        linkedlist.add(0, "Arvind");
        linkedlist.addFirst("Bhaskar");
        linkedlist.addLast("Tarun");

        System.out.println(linkedlist);

        System.out.println("Bhaskar is in LinkedList : " + linkedlist.contains("Bhaskar"));

        System.out.println();

        linkedlist.add("Varun");
        linkedlist.add("Monty");
        linkedlist.add("Ponty");

        System.out.println(linkedlist);

        int count = linkedlist.size(), i = 0;

        while (i<count) {
            String element = linkedlist.get(i);
            linkedlist.remove(i++);
            linkedlist.addFirst(element);
        }
        System.out.println(linkedlist);
    }
}
