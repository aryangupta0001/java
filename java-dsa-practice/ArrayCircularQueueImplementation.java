class Queue {
    int[] queue = new int[10];
    int front = -1;
    int rear = -1;

    void enque(int element) {
        if (front < 0) {
            front++;
            queue[++rear] = element;
            System.out.println(element + " queued");
        }

        else {
            if ((rear + 1) % 10 == front) {
                System.out.println("Cannot Enqueue, Queue is Full");
            }

            else {
                queue[++rear % 10] = element;
                System.out.println(element + " queued");
            }
        }
    }

    void dequeue() {
        if (front < 0) {
            System.out.println("Cannot Dequeue !!! Queue is Empty");
        }

        else {
            System.out.println(queue[front] + " dequeued");

            if (front == rear) {
                front = -1;
                rear = -1;
            }

            else
                front = (front + 1) % 10;
        }
    }

    void peek() {
        if (front == -1)
            System.out.println("Queue is Empty");

        else
            System.out.println("Front : " + queue[front]);
    }

    void isEmpty() {
        System.out.println("Empty : " + (front == -1));
    }
}

public class ArrayCircularQueueImplementation {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);
        queue.enque(60);
        queue.enque(70);
        queue.enque(80);
        queue.enque(90);
        queue.enque(100);
        queue.enque(110);
        queue.dequeue();
        queue.enque(20);
        queue.isEmpty();
        queue.enque(20);
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.isEmpty();
        queue.dequeue();
    }
}