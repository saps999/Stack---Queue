package com.bridgelabz1;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.add(data);
    }

    public void dequeue() {
        linkedList.deleteAtStart();
    }

    public void print() {
        linkedList.print();
    }

}
