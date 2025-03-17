package com.scaler.examples.stack;

/*Class TreeNode{

int val;
TreeNode right, left;

TreeNode(int X){
val = x;
left = right = null;
}

}
*/


import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;

//Construct a Binary Tree from Preorder and Inorder Traversal
public class BuildTree {

    HashMap<Integer,Integer> inOrderIndexMap;
    private int preOrderIndexMap;

    public TreeNode builtree(int[] preOrder , int[] inOrder){

        inOrderIndexMap = new HashMap<>();

        preOrderIndexMap =0;


       for (int i=0;i<preOrder.length;i++) {
           inOrderIndexMap.put(inOrder[i], i);

       }

       return constructTree(preOrder,0,inOrder.length);
    }

    private TreeNode constructTree(int[] preOrder, int left, int right) {

        if (left > right) return null;

        // Pick current node from preorder and move index forward

        int rootValue = preOrder[preOrderIndexMap++];
        TreeNode root = new TreeNode() {
            @Override
            public TreeNode getChildAt(int childIndex) {
                return null;
            }

            @Override
            public int getChildCount() {
                return 0;
            }

            @Override
            public TreeNode getParent() {
                return null;
            }

            @Override
            public int getIndex(TreeNode node) {
                return 0;
            }

            @Override
            public boolean getAllowsChildren() {
                return false;
            }

            @Override
            public boolean isLeaf() {
                return false;
            }

            @Override
            public Enumeration<? extends TreeNode> children() {
                return null;
            }
        };

        return root;
    }


}

