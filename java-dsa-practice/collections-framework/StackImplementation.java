/*
🧩 Task 3: Implement a Stack class in Java (without using Stack API)

Use ArrayList internally:
*/

import java.util.ArrayList;

class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    void push(int n) {
        stack.add(n);
        System.out.println("Pushed : " + n);
    }

    void pop() {
        if (stack.size() > 0)
            System.out.println("Popped : " + stack.remove(stack.size() - 1));

        else
            System.out.println("Stack underflow");
    }
    
    void peek() {
        if (stack.size() > 0)
            System.out.println("Top : " + stack.get(stack.size() - 1));

        else
            System.out.println("Stack Empty");
    }

    void isEmpty() {
        System.out.println("Stack Empty : " + (stack.size() == 0));
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(0);
        stack.push(2);
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.pop();
        stack.isEmpty();
        stack.pop();
    }
}
