package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        // Display the stack
        System.out.println("Stack: " + stack);

        // Popping the top element from the stack
        String popped = stack.pop();
        System.out.println("Popped: " + popped);
        
        // Display the stack after popping
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element of the stack
        String top = stack.peek();
        System.out.println("Top of the stack: " + top);
        
        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
