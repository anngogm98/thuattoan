package org.example.thuattoan.leetcode.fail;

public class FindBottomLeftTreeValue513 {

    public int findBottomLeftValue(TreeNode root) {
        TreeNode currentNode = root;
        int rank = 0;
        int leftVal = root.val;
        while(currentNode != null) {

        }
        return 0;
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
