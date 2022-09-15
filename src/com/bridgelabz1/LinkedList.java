package com.bridgelabz1;

public class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void addAtStart(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void deleteAtStart() {
        Node<T> node = head;
        head = head.next;
        System.out.println("Node deleted is: " + node.data);
    }

    public void deleteAt(int index) {
        if (index == 0) {
            deleteAtStart();
        } else {
            Node<T> node = head;
            Node<T> node1 = null;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node1 = node.next;
            node.next = node1.next;

            System.out.println("Node deleted is: " + node1.data);
        }
    }

    public void print() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void print(int index) {
        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        System.out.println(node.data);
    }

}
