package org.gabota.neetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
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


    public TreeNode invertTree(TreeNode root) {
        TreeNode top = root;

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null)
            q.add(root);

        while (q.peek() != null) {
            root = q.remove();
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }

        return top;
    }

    public static void main(String[] args) {
        // [4,2,7,1,3,6,9]
        TreeNode r = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        printTree(r);

        InvertBinaryTree e = new InvertBinaryTree();
        TreeNode invertTree = e.invertTree(r);
        printTree(invertTree);
    }

    private static void printTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ai = new ArrayList<>();
        q.add(root);
        while (q.peek() != null) {
            TreeNode node = q.remove();
            q.add(node.left);
            q.add(node.right);
            ai.add(node.val);
        }
        System.out.println(ai);
    }
}
