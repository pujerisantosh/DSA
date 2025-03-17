package com.scaler.examples.trees;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class PreorderTraversa {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(A, result);
        return result;
    }

    private void preorderHelper(TreeNode node, ArrayList<Integer> result) {
        if (node == null) return;

        result.add(node.val); // Root
        preorderHelper(node.left, result); // Left
        preorderHelper(node.right, result); // Right
    }

    public static void main(String[] args) {
        PreorderTraversa p1 = new PreorderTraversa();

        // Example 1: Tree [1, null, 2, 3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        System.out.println(p1.preorderTraversal(root1)); // Output: [1, 2, 3]


    }
}

