package Java.Core.Generics;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListGeneric<employee> li = new LinkedListGeneric<employee>();
        int age = sc.nextInt();
        String name = sc.next();
        employee e = new employee(name, age);
        li.insertAtFront(e);
        li.Printable();
    }
}

class employee {
    private String name;
    private int age;

    public employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return age + name;
    }
}

class LinkedListGeneric<T> {
    private Node head;

    public LinkedListGeneric() {
        head = null;
    }

    public void insertAtFront(T data) {
        Node nd = new Node(data);
        if (head == null) {
            head = nd;
        } else {
            nd.next = head;
        }
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T d) {
            data = d;
            next = null;
        }
    }

    public void Printable() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}