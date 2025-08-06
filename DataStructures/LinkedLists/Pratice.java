package DataStructures.LinkedLists;

public class Pratice {

    public static void main(String[] args) {

    }
}

class employee {
    private String name;
    private int age;

    employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

class LinkedLists<T> {
    private Node head;

    LinkedLists() {
        head = null;
    }

    private class Node {
        private T data;
        private Node next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    public void insertAtFront(T data) {
        Node nd = new Node(data);
        nd.next = head;
        head = nd;
    }

    public void removeFromFront() {
        T removedData = head.data;
        head = head.next;
    }
}