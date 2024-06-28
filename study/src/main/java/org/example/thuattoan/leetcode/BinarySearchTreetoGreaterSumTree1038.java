package org.example.thuattoan.leetcode;

import java.util.Optional;

public class BinarySearchTreetoGreaterSumTree1038 {

    public static void main(String[] args) {

    }

    public static TreeNode bstToGst(TreeNode root) {
        if(root.right!= null) {
            bstToGst(root.right);
            root.val+=root.right.val;
        }
        if(root.left!=null) {
            bstToGst(root.left);
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
