# 📘 Introduction to Binary Trees

Binary trees are hierarchical data structures composed of nodes, similar in some ways to linked lists. In a **linked list**, each node typically contains data and a reference to the **next** node:

```text
node.data → value
node.next → address of the next node
```

In contrast, a **binary tree node** connects to **two** other nodes: the **left** child and the **right** child.

## 🔑 Key Concepts

- **Root Node**: The top-most node in the tree.
- **Parent Node**: A node that has one or more child nodes.
- **Child Node**: A node that is a direct descendant of another node.
- **Leaf Node**: A node that has no children.
- **Sibling Nodes**: Nodes that share the same parent.
- **Ancestor**: Any node that lies on the path from a given node to the root.
- **Descendant**: Any node that lies on the path from a given node down to a leaf.
- **No Cycles**: Binary trees do not contain cycles — there is only one path between the root and any given node.

## 🔄 Traversal Methods

Binary trees can be traversed using two primary strategies:

### 1. Breadth-First Search (BFS)

- Traverses the tree level by level.
- Typically implemented using a **queue**.

### 2. Depth-First Search (DFS)

- Explores as far as possible along each branch before backtracking.
- DFS is foundational for solving ~90% of binary tree problems.
- DFS underpins several key algorithms:
  - **Backtracking**
  - **Dynamic Programming on Trees**
  - **Divide and Conquer**

## ✅ Basic Java Implementation of a Tree Node

```java
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}
This class defines a simple binary tree node with an integer value and references to its left and right children.
