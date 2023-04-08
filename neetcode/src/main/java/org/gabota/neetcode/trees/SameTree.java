package org.gabota.neetcode.trees;

import java.util.LinkedList;

public class SameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        LinkedList<TreeNode> pl = new LinkedList<>();
        LinkedList<TreeNode> ql = new LinkedList<>();

        pl.add(p);
        ql.add(q);

        while (pl.size() != 0 && ql.size() != 0) {
            TreeNode pNode = pl.pop();
            TreeNode qNode = ql.pop();

            if(!isEqual(pNode, qNode)) return false;
            if (pNode == null) continue;
            if(!isEqual(pNode.left, qNode.left)) return false;
            if(!isEqual(pNode.right, qNode.right)) return false;

            if (pNode.left != null) {
                pl.add(pNode.left);
                ql.add(qNode.left);
            }

            if (pNode.right != null) {
                pl.add(pNode.right);
                ql.add(qNode.right);
            }
        }

        if (pl.size() != ql.size()) return false;

        return true;
    }

    boolean isEqual(TreeNode pNode, TreeNode qNode) {
        if (pNode == null && qNode == null) return true;
        return pNode != null && qNode != null && pNode.val == qNode.val;
    }


    public static void main(String[] args) {
        TreeNode testTree = new TreeNode(1);
        TreeNode testTree2 = new TreeNode(1, null, new TreeNode(2));
        SameTree s = new SameTree();
        System.out.println(s.isSameTree(testTree, testTree2));
    }
}
