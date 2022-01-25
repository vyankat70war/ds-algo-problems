package com.vss.code.recursion;

import com.vss.code.model.TreeNode;

public class HeightOfBinaryTree {
    public int height(TreeNode<Integer> root) {

        if ( root == null) {
            return 0;
        }

        int leftHeight = height(root.getLeft());
        int rightHeight = height(root.getRight());

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        HeightOfBinaryTree binaryTree = new HeightOfBinaryTree();

        TreeNode<Integer> root = new TreeNode<>(9);
        TreeNode<Integer> left = new TreeNode<>(8);
        root.setLeft(left);

        TreeNode<Integer> right = new TreeNode<>(10);
        root.setRight(right);

        System.out.println(binaryTree.height(root));
    }
}
