package com.scaler.examples.trees;


import java.util.ArrayList;

public class PostOrderTravasal {

    public ArrayList<Integer> solution(TreeNode A){

        ArrayList<Integer> result = new ArrayList<>();

        postHelper(A, result);
        return  result;
    }

    private  void postHelper(TreeNode A , ArrayList<Integer> result){

        if(A ==null) return;

        postHelper(A.left, result);   // ✅ Visit Left subtree
        postHelper(A.right, result);  // ✅ Visit Right subtree
        result.add(A.val);
    }

    public static void main(String[] args) {
        PostOrderTravasal p1 = new PostOrderTravasal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        

    }


}
