/*
5️⃣ Counter of Objects

🧩 Concept: Static Keyword
⚙️ Create a class Counter that keeps track of how many objects have been created.
💡 Hint: Use a static variable that increments inside the constructor.

*/

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
        // obj[i] = new Test();
        // }

        System.out.println(Test.counter);
    }
}