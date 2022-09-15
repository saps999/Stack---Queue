package com.bridgelabz;

public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<>();
    int index = 0;

    public void push(T data) {
        index = index + 1;
        linkedList.add(data);
    }

    public void pop() {
        index = index - 1;
        linkedList.deleteAt(index);
    }

    public void peek() {
        linkedList.print(index);
    }

}
