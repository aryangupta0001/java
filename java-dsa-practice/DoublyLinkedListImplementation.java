class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DoublyLinkedListImplementation {

    Node head;

    public DoublyLinkedListImplementation() {
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

    void insertBeg(int data) {
        Node newNode = new Node(data);

        newNode.prev = null;
        newNode.next = this.head;

        this.head = newNode;

        System.out.println("Node with data : " + data + " inserted");
    }

    void delete(int data) {
        if (this.head == null)
            System.out.println("Linked List is empty");

        else {
            if (this.head.data == data) {
                this.head = this.head.next;
                this.head.prev = null;
                System.out.println("Node with Data : " + data + " deleted");
            }

            else {
                Node obj1;
                boolean deleted = false;

                obj1 = this.head;

                while (obj1 != null)
                    if (obj1.data == data) {
                        obj1.prev.next = obj1.next;
                        System.out.println("Node with Data : " + data + " deleted");
                        obj1 = null;
                        deleted = true;
                        break;
                    }

                    else {
                        obj1 = obj1.next;
                    }

                if (!deleted)
                    System.out.println("No node with data : " + data + " found in LinkedList");
            }
        }
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

    void display() {
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedListImplementation linkedList = new DoublyLinkedListImplementation();

        linkedList.insertEnd(10);
        linkedList.insertEnd(20);
        linkedList.insertBeg(0);
        linkedList.display();
        linkedList.delete(20);
        linkedList.delete(50);
        linkedList.insertEnd(30);
        linkedList.insertBeg(40);
        linkedList.insertEnd(50);
        linkedList.insertEnd(60);
        linkedList.insertEnd(70);
        linkedList.delete(60);
        linkedList.insertEnd(80);
        linkedList.insertBeg(90);
        linkedList.display();
        linkedList.search(70);
    }
}