package com.bridgelabz;

public class StackRunner {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.peek();
        stack.push(20);
        stack.peek();
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
