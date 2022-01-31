package com.vss.code.model;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public void print(){
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        printInorder(this, sb);
        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
        sb.append("]");
        System.out.println(sb);
    }

    /* Given a binary tree, print its nodes in inorder*/
    private void printInorder(TreeNode node, StringBuilder sb)
    {
        if (node == null)
            return;

        printInorder(node.left, sb);

        sb.append(node.data).append(",");

        printInorder(node.right, sb);
    }
}
