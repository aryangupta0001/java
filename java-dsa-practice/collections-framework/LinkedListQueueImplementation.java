import java.util.LinkedList;

class Queue {
    LinkedList<String> queue = new LinkedList<>();

    void enqueue(String person) {
        queue.add(person);
        System.out.println("Customer " + person + " joined queue.");
    }

    void dequeue() {
        if (!queue.isEmpty())
            System.out.println("Serving customer " + queue.removeFirst());

        else
            System.out.println("No customers to serve");
    }

    void peek() {
        if (!queue.isEmpty())
            System.out.println("Front : " + queue.getFirst());

        else
            System.out.println("Queue is Empty");
    }

    void isEmpty(){
        System.out.println("Empty : " + queue.isEmpty());
    }

}

public class LinkedListQueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Aryan");
        queue.enqueue("Arvind");
        queue.peek();
        queue.isEmpty();

        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.isEmpty();
        queue.peek();

        queue.dequeue();
    }
}