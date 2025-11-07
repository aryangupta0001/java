class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    Node head;

    public ReverseLinkedList() {
        this.head = null;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null) {
            newNode.prev = null;
            this.head = newNode;
        }

        else {
            Node current = head;

            while (current.next != null)
                current = current.next;

            current.next = newNode;
            newNode.prev = current;
        }

        System.out.println("Node with data : " + data + " inserted");
    }

    void search(int data) {
        if (this.head == null)
            System.out.println("Linked List is Empty");

        else {
            Node obj1 = this.head;
            int count = 1;
            boolean found = false;

            while (obj1 != null)
                if (obj1.data == data) {
                    System.out.println("Node found with data : " + data + " at position : " + count);
                    found = true;
                    break;
                } else {
                    obj1 = obj1.next;
                    count++;
                }

            if (!found)
                System.out.println("Node with data : " + data + " not found in LinkedList");
        }
    }

    void reverse() {
        Node prev, curr, next;

        curr = this.head;
        prev = null;
        next = curr.next;

        while (curr != null) {

            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null)
                next = next.next;
        }

        this.head = prev;
    }

    void display() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();

        linkedList.insertEnd(10);
        linkedList.insertEnd(20);
        linkedList.insertEnd(0);
        linkedList.insertEnd(30);
        linkedList.insertEnd(40);
        linkedList.insertEnd(50);
        linkedList.insertEnd(60);
        linkedList.insertEnd(70);
        linkedList.insertEnd(80);
        linkedList.insertEnd(90);

        linkedList.display();
        
        linkedList.reverse();
        
        linkedList.display();

    }
}