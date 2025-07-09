package Task_4.Collection;

import java.util.Stack;

public class IntegerStack {
    Stack<Integer> stack = new Stack<>();

    public void pushElement(int val) {
        stack.push(val);
        System.out.println(val + " pushed to stack.");
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void isEmpty() {
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        s.pushElement(10);
        s.pushElement(20);
        s.popElement();
        s.isEmpty();
    }
}
