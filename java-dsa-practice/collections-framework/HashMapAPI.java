import java.util.HashMap;

public class HashMapAPI {
    public static void main(String[] args) {
        HashMap <Integer, Integer> hashmap = new HashMap<>();

        hashmap.put(2, 4);
        hashmap.put(3, 9);
        System.out.println(hashmap.keySet());

    }
}
