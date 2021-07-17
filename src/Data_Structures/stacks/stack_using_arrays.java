package Data_Structures.stacks;

import java.util.ArrayList;
import java.util.Stack;

public class stack_using_arrays {
    ArrayList<String> stackArray;

    public stack_using_arrays() {
        this.stackArray = new ArrayList<>();
    }

    public String peek() {
        if (this.stackArray.size() > 0) {
            return stackArray.get(stackArray.size() - 1);
        } else {
            return null;
        }
    }

    public void push(String value) {
        this.stackArray.add(value);
    }

    public void pop() {
        this.stackArray.remove(stackArray.size() - 1);
    }

    public boolean isEmpty() {
        return stackArray.size() == 0;
    }

    public static void main(String[] args) {
        stack_using_arrays myStack = new stack_using_arrays();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
