# Generic Linked List in Java (`LinkedListGeneric`)

This document explains the implementation and usage of a generic singly linked list in Java, as defined in the `DataStructures.LinkedLists.LL` class and its supporting classes. It covers list operations, the iterator pattern, and object encapsulation for demonstration.

---

## 1. Overview

- **Generic Linked List:**  
  The `LinkedListGeneric<T>` class provides a singly linked list for any object type `T`.
- **Iterator Pattern:**  
  The `Iterator<I>` interface and `LLIterator` inner class allow forward traversal through the list.
- **Custom Object Demo:**  
  The `Number` class is used to store integer values, demonstrating object reference storage in the list.

---

## 2. Key Components

### a. `LinkedListGeneric<T>` Class

- **Fields:**
    - `Node head;` — Reference to the first node in the list.
- **Inner Class:**
    - `Node` — Each node stores `data` (of type `T`) and a reference to the next node.
- **Main Methods:**
    - `insertAtFront(T data)` — Inserts a node at the front (head) of the list.
    - `removeFromFront()` — Removes the node at the front. (No-op if empty)
    - `print()` — Prints all elements in the list.
    - `getIterator()` — Returns an iterator for the list.

### b. `LLIterator` Class

- Implements `Iterator<T>`.
- Maintains a cursor (`t`) for traversal.
- `has_next()` — Returns `true` if another element exists.
- `get_next()` — Advances the cursor and returns the next element.

### c. `Number` Class

- Wraps an `int` value for demonstration.
- Overrides `toString()` for pretty-printing.

### d. `Iterator<I>` Interface

- Defines:
    - `boolean has_next()`
    - `I get_next()`

---

## 3. Example Usage (`LL` class)

The `LL` class provides a command-line menu for list interaction:

- **Insert:** Adds a new `Number` to the front.
- **Remove:** Removes the front item.
- **Print:** Prints the list using the `print()` method.

#### Main Loop Snippet
```java
LinkedListGeneric<Number> ll = new LinkedListGeneric<>();
System.out.println("1 -> insert, 2 -> remove, 3 -> print, 4 -> exit");
Scanner sc = new Scanner(System.in);
while (true) {
    int loop = sc.nextInt();
    switch (loop) {
        case 1:
            int number = sc.nextInt();
            Number n = new Number(number);
            ll.insertAtFront(n);
            break;
        case 2:
            ll.removeFromFront();
            break;
        case 3:
            ll.print();
        default:
            break;
    }
}
```

---

## 4. Sample Console Session

```
1 -> insert, 2 -> remove, 3 -> print, 4 -> exit
1 10
1 20
3
20 --> 10 -->
2
3
10 -->
```

---

## 5. Notes

- **Type Safety:** `LinkedListGeneric` supports any object type.
- **Custom Iterator:** Provides an alternative to Java’s built-in iterator for demonstration and learning.
- **No Size Field:** This implementation does not track list size.
- **No Null Checks:** Removing from an empty list may cause a `NullPointerException`.

---

## 6. References

- [Singly Linked List - GeeksforGeeks](https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/)
- [Java Generics - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/generics/)
- [Iterator Pattern - Wikipedia](https://en.wikipedia.org/wiki/Iterator_pattern)
