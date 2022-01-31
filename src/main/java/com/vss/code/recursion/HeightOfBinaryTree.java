package com.vss.code.recursion;

import com.vss.code.model.TreeNode;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        HeightOfBinaryTree binaryTree = new HeightOfBinaryTree();

        TreeNode root = new TreeNode(9);
        TreeNode left = new TreeNode(8);
        root.setLeft(left);

        TreeNode right = new TreeNode(10);
        root.setRight(right);

        System.out.println(binaryTree.height(root));
    }

    public int height(TreeNode root) {

        if ( root == null) {
            return 0;
        }

        int leftHeight = height(root.getLeft());
        int rightHeight = height(root.getRight());

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
