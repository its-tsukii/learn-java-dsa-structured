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
        // ✅ Correct logic: smaller to left, larger to right
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
            return; // ✅ Base case to avoid null pointer exception

        In_order(root.left);
        System.out.print(root.val + " "); // ✅ Fixed: print on same line
        In_order(root.right);
    }
}
