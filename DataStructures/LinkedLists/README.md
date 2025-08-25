# Linked Lists in Java

A **Linked List** is a fundamental data structure where elements (called nodes) are stored in a linear order, but not in contiguous memory like arrays. Each node contains the data and a reference (or link) to the next node in the sequence. Linked lists are dynamic and can grow or shrink in size efficiently, making them useful for scenarios where frequent insertions and deletions are required.

---

## 1. Types of Linked Lists

- **Singly Linked List:** Each node points to the next node.
- **Doubly Linked List:** Each node points to both the next and previous nodes.
- **Circular Linked List:** The last node points back to the first node.

---

## 2. Basic Structure of a Singly Linked List

```java
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## 3. Operations

### a. Insertion

- **At Front (Head):**  
  Insert a new node before the current head and update the head.
- **At End (Tail):**  
  Traverse to the last node and link the new node.
- **At a Position:**  
  Traverse to the position and insert the new node.

### b. Deletion

- **From Front (Head):**  
  Move the head pointer to the next node.
- **From End (Tail):**  
  Traverse to the second last node and set its next to null.
- **By Value:**  
  Find the node with the target value and unlink it.

### c. Traversal

- Visit each node starting from the head and process the data.

### d. Searching

- Traverse the list and compare each node’s data with the target value.

---

## 4. Example: Singly Linked List in Java

```java
class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Insert at front
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Remove from front
    public void removeFromFront() {
        if (head != null) head = head.next;
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
```

---

## 5. Advantages and Disadvantages

| Advantages                      | Disadvantages                           |
|----------------------------------|-----------------------------------------|
| Dynamic size (no predefined length) | More memory (extra pointer per node)      |
| Easy insertion/deletion at ends  | No random access (O(n) to access by index) |
| Efficient memory usage for frequent ops | Cache locality is poor compared to arrays |

---

## 6. Use Cases

- Implementing stacks and queues
- Undo functionality in applications
- Dynamic memory allocation
- Graph and adjacency list representations

---

## 7. Additional Resources

- [GeeksforGeeks: Linked List Data Structure](https://www.geeksforgeeks.org/data-structures/linked-list/)
- [Oracle Java Documentation: LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
- [Wikipedia: Linked List](https://en.wikipedia.org/wiki/Linked_list)
