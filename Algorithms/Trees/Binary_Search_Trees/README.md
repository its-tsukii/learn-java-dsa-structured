# 🌲 Introduction to Binary Search Trees (BST)

A **Binary Search Tree (BST)** is a specialized type of **binary tree** that maintains a **sorted order** among its elements.

While a **binary tree** is simply a structure where each node can have at most two children (left and right), a **BST adds an ordering constraint**:

- The **left child** of a node must contain a **value less than** the node's value.
- The **right child** must contain a **value greater than** the node's value.

This property makes **searching**, **insertion**, and **deletion** operations efficient — typically **O(log n)** time in a balanced BST.

> You can think of BST as a natural evolution of a binary tree, where sorting is built into the structure, just like how stacks and queues are built on top of arrays but impose specific access patterns.

## 📋 Key Properties of a BST

- Every subtree of a BST is itself a BST.
- BSTs do not allow cycles (like binary trees).
- Allows for **efficient binary search** due to its ordering.
- In-order traversal of a BST results in a **sorted list** of values.

### 📌 Real-world Analogy

Just like:

- A **stack** is a LIFO (Last In First Out) abstraction over an array.
- A **queue** is a FIFO (First In First Out) abstraction over an array.

A **Binary Search Tree** is a **sorted hierarchical structure** built upon the base concept of a binary tree.

## ✅ Java Definition of a BST Node (Same as Binary Tree Node)

```java
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}
```

### This document covers the three fundamental operations of a **Binary Search Tree (BST)**:

- ✅ Insertion
- 🔍 Search
- ❌ Deletion

Each operation is implemented in Java with clean, readable code.

---

## 📘 BST Node Definition

```java
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
```

### ✅ Insert a Node into BST

```java
public TreeNode insert(TreeNode root, int val) {
    if (root == null) {
        return new TreeNode(val);
    }

    if (val < root.val) {
        root.left = insert(root.left, val);
    } else if (val > root.val) {
        root.right = insert(root.right, val);
    }

    // Duplicate values are ignored
    return root;
}
```

### 🔍 Search for a Value in BST

```java
public boolean search(TreeNode root, int val) {
    if (root == null) return false;

    if (val == root.val) return true;
    else if (val < root.val) return search(root.left, val);
    else return search(root.right, val);
}
```

### ❌ Delete a Node from BST

```java
public TreeNode delete(TreeNode root, int val) {
    if (root == null) return null;

    if (val < root.val) {
        root.left = delete(root.left, val);
    } else if (val > root.val) {
        root.right = delete(root.right, val);
    } else {
        // Node to delete found

        // Case 1: No child
        if (root.left == null && root.right == null) {
            return null;
        }
        // Case 2: One child
        else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        // Case 3: Two children
        else {
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }
    }

    return root;
}

private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
        node = node.left;
    }
    return node;
}
```

### 🔁 Inorder Traversal (Optional: For Testing)

```java
public void inorder(TreeNode root) {
    if (root != null) {
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
```

### 🧪 Example Usage

```java
public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        TreeNode root = null;

        // Insert values
        root = bst.insert(root, 50);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 20);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 80);

        // Print inorder (should be sorted)
        System.out.print("Inorder traversal: ");
        bst.inorder(root);
        System.out.println();

        // Search
        System.out.println("Search 60: " + bst.search(root, 60)); // true
        System.out.println("Search 25: " + bst.search(root, 25)); // false

        // Delete
        root = bst.delete(root, 70);
        System.out.print("Inorder after deleting 70: ");
        bst.inorder(root);
        System.out.println();
    }
}
```

### 🧠 Notes

- Inorder traversal of BST always returns sorted values.
- Insert, search, and delete operations are O(log n) on average but O(n) in the worst-case (unbalanced tree).
- For guaranteed performance, consider AVL Trees or Red-Black Trees (self-balancing BSTs).
