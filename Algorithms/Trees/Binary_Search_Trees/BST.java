package Algorithms.Trees.Binary_Search_Trees;

public class BST {
    public static void main(String[] args) {
        BST bst = new BST();
        TreeNode root = null;

        // Insert values
        root = Operations.Insert(root, 50);
        root = Operations.Insert(root, 30);
        root = Operations.Insert(root, 70);
        root = Operations.Insert(root, 20);
        root = Operations.Insert(root, 40);
        root = Operations.Insert(root, 60);
        root = Operations.Insert(root, 80);

        // Print inorder (should be sorted)
        System.out.print("Inorder traversal: ");
        Operations.In_order(root);
        System.out.println();

        // Search
        System.out.println("Search 60: " + Operations.search(root, 60)); // true
        System.out.println("Search 25: " + Operations.search(root, 25)); // false

        // FindMin
        System.out.println(Operations.findMin(root).val);

        // FindMax
        System.out.println(Operations.findMax(root).val);

        // Removal of Node
        Operations.removeNode(root, 30);

        // Printable
        System.out.print("Inorder traversal: ");
        Operations.In_order(root);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Operations {

    static TreeNode Insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        // Correct logic: smaller to left, larger to right
        if (data < root.val) {
            root.left = Insert(root.left, data);
        } else if (data > root.val) {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    static boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.val > target) {
            return search(root.left, target);
        } else if (root.val < target) {
            return search(root.right, target);
        } else {
            return true;
        }
    }

    static void In_order(TreeNode root) {
        if (root == null)
            return;

        In_order(root.left);
        System.out.print(root.val + " ");
        In_order(root.right);
    }

    static TreeNode findMin(TreeNode root) {
        TreeNode curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    static TreeNode findMax(TreeNode root) {
        TreeNode curr = root;
        while (curr != null && curr.right != null) {
            curr = curr.right;
        }
        return curr;
    }

    static TreeNode removeNode(TreeNode root, int val) {
        TreeNode minNode;
        if (root == null) {
            return null;
        }

        if (val > root.val) {
            root.right = removeNode(root.right, val);
        } else if (val < root.val) {
            root.left = removeNode(root.left, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = removeNode(root.right, minNode.val);
            }
        }
        return root;
    }
}
