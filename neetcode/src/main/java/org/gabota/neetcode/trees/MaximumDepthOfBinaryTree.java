package org.gabota.neetcode.trees;

public class MaximumDepthOfBinaryTree {
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int dfs(TreeNode root) {
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left, right) + 1;
    }


    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}
