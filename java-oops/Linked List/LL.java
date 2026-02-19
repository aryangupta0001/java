public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtBeg(int val) {
        Node node = new Node(val, head);

        if (tail == null)
            tail = node;

        head = node;
        size++;
    }

    public void insertAtEnd(int val) {
        Node node = new Node(val);

        if (head == null)
            head = node;

        else
            tail.next = node;

        tail = node;

        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (size == 0)
            insertAtBeg(val);

        else {
            Node temp = head;

            int i = 0;

            while (temp.next != null && i < index) {
                temp = temp.next;
                i++;
            }

            Node node = new Node(val);

            node.next = temp.next;
            temp.next = node;

            if (node.next == null)
                tail = node;

            size++;
        }
    }

    public int deleteAtStart() {
        int val = 0;

        if (head != null) {
            val = head.value;
            head = head.next;

            if (head == null)
                tail = null;

            size--;
        }

        return val;
    }

    public int deleteAtEnd() {
        int val = 0;

        if (head != null) {
            Node temp1 = head;
            Node temp2 = temp1;

            while (temp1.next != null) {
                temp2 = temp1;
                temp1 = temp1.next;
            }

            val = temp1.value;

            if (temp2 == temp1) {
                head = null;
                tail = null;
            }

            else {
                temp2.next = null;
                tail = temp2;
            }
            size--;
        }

        return val;
    }

    public int deleteAtIndex(int index) {
        int val = 0, i = 0;

        if (head != null) {
            Node temp1 = head;
            Node temp2 = temp1;

            while (temp1.next != null && i < index) {
                temp2 = temp1;
                temp1 = temp1.next;
                i++;
            }

            if (i < index)
                deleteAtEnd();

            else if (i == 0)
                deleteAtStart();

            else {
                temp2.next = temp1.next;

                if (temp2.next == null)
                    tail = temp2;
            }

            size--;
        }

        return val;
    }

    public void insertRecursion(int val, int index) {
        head = insetRecursively(val, index, head);
    }

    private Node insetRecursively(int val, int index, Node temp) {

        if (index == 0) {
            Node node = new Node(val, temp);
            return node;
        }

        if (temp == null) {
            Node node = new Node(val);
            node.next = null;
            return node;
        }

        temp.next = insetRecursively(val, --index, temp.next);
        
        return temp;
    }

    public void displayLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
