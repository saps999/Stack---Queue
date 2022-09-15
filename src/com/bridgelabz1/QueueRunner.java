package com.bridgelabz1;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
