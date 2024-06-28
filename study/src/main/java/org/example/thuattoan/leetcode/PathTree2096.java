package org.example.thuattoan.leetcode;

public class PathTree2096 {
    public static void main(String[] args) {

    }

//    public static String getDirections(TreeNode root, int startValue, int destValue) {
//
//        if(root.val!=startValue&&root.val!=destValue) {
//            return getDirections(root.left)
//        }
//    }

     public static class TreeNode {
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
}
