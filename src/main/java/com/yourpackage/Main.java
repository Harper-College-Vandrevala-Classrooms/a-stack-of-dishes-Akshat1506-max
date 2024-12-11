package main.java.com.yourpackage;

import java.util.Stack;

public class Main {

    // Simulate a real-world stack usage in a function call hierarchy
    public static void main(String[] args) {
        System.out.println("Real-World Example: Function Call Stack");

        // Create a stack to simulate a call stack
        Stack<String> callStack = new Stack<>();

        // Simulate function calls
        System.out.println("Calling main()");
        callStack.push("main()");

        System.out.println("Calling functionA()");
        callStack.push("functionA()");

        System.out.println("Calling functionB()");
        callStack.push("functionB()");

        // Simulate function returns
        System.out.println("Returning from: " + callStack.pop());
        System.out.println("Returning from: " + callStack.pop());
        System.out.println("Returning from: " + callStack.pop());

        // Check if stack is empty
        if (callStack.isEmpty()) {
            System.out.println("Call stack is empty. All functions have returned.");
        }
    }
}