package com.vss.code.helpers;

import com.vss.code.model.TreeNode;

import java.util.Random;

public class TreeHelper {

    public static TreeNode getIntegerTree(int nodeCount) {
        final int[] treeNodeValues = ArrayHelper.getArray(nodeCount);
        TreeNode root = null;
        TreeNode right = null;
        TreeNode left = null;
        Random random = new Random();
        for (int value : treeNodeValues) {
            final int side = random.nextInt(2);
            final int sideLocal = random.nextInt(2);
            if (root == null) {
                root = new TreeNode(value);
            } else if (side == 0) {
                if (sideLocal == 0) {
                    right = setRootRightRight(root, right, value);
                } else {
                    right = setRootRightLeft(root, right, value);
                }
            } else {
                if (sideLocal == 0) {
                    left = setRootLeftRight(root, left, value);
                } else {
                    left = setRootLeftLeft(root, left, value);
                }
            }
        }
        return root;
    }


    private static TreeNode setRootRightLeft(TreeNode root, TreeNode right, Integer value) {
        if (right == null) {
            right = new TreeNode(value);
            root.setRight(right);
            return right;
        }
        final TreeNode node = new TreeNode(value);
        right.setLeft(node);
        right = node;
        return right;
    }
    private static TreeNode setRootRightRight(TreeNode root,TreeNode right, Integer value) {
        if (right == null) {
            right = new TreeNode(value);
            root.setRight(right);
            return right;
        }
        final TreeNode node = new TreeNode(value);
        right.setRight(node);
        right = node;
        return right;
    }
    private static TreeNode setRootLeftRight(TreeNode root,TreeNode left, Integer value) {
        if (left == null) {
            left = new TreeNode(value);
            root.setLeft(left);
            return left;
        }
        final TreeNode node = new TreeNode(value);
        left.setRight(node);
        left = node;
        return left;
    }
    private static TreeNode setRootLeftLeft(TreeNode root,TreeNode left, Integer value) {
        if (left == null) {
            left = new TreeNode(value);
            root.setLeft(left);
            return left;
        }
        final TreeNode node = new TreeNode(value);
        left.setLeft(node);
        left = node;
        return left;
    }
}
