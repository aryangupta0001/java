public class Main {
    public static void main(String[] args) {
        // Singleton singleton;

        // singleton = Singleton.getInstance();

        // System.out.println(singleton.a);

        LL obj = new LL();

        // obj.insertAtIndex(9, 0);

        // obj.insertAtEnd(7);

        // obj.insertAtBeg(3);

        // obj.insertAtEnd(11);

        // obj.insertAtBeg(5);

        // obj.insertAtIndex(10, 2);

        // obj.insertAtIndex(0, 6);
        // obj.insertAtIndex(13, 7);

        // obj.displayLL();

        // obj.deleteAtIndex(4);

        // System.out.println(obj.deleteAtStart());

        obj.insertRecursion(1, 3);

        obj.displayLL();

        obj.insertRecursion(2, 10);

        obj.insertRecursion(5, 1);

        // System.out.println(obj.deleteAtEnd());

        obj.displayLL();
    }
}
