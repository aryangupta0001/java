class Test {
    static int counter = 0;

    Test() {
        counter++;
    }
}

public class objectCounter {
    public static void main(String[] args) {

        Test[] obj = new Test[20];

        for (int i = 0; i < 10; i++) {
            Test objects = new Test();
        }

        // or

        // for (int i = 0; i < 10; i++) {
        //     obj[i] = new Test();
        // }

        System.out.println(Test.counter);
    }
}