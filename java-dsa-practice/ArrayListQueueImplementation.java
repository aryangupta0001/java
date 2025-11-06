import java.util.ArrayList;

class Queue {
    ArrayList<Integer> queue = new ArrayList<>();

    void enque(int element) {
        queue.add(element);
        System.out.println(element + " Queued");
    }

    void dequeue() {
        if (queue.size() > 0)
            System.out.println(queue.remove(0) + " Dequeued");

        else
            System.out.println("Cannot Dequeu !!! Queue is Empty");
    }

    void peek() {
        if (queue.size() > 0)
            System.out.println("Front : " + queue.get(0));

        else
            System.out.println("Queue is Empty");

    }

    void isEmpty() {
        System.out.println("Empty : " + (queue.size() == 0));
    }

}

public class ArrayListQueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enque(10);
        ;
        queue.peek();
        queue.enque(20);
        queue.dequeue();
        queue.isEmpty();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.isEmpty();

    }
}
