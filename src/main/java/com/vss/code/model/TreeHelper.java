package com.vss.code.model;

import java.util.Random;

public class TreeHelper {

    public static TreeNode<Integer> getIntegerTree(int nodeCount) {

        Random random = new Random();
        TreeNode<Integer> root = new TreeNode<>(random.nextInt());

        // right
        for (int i = 0; i < nodeCount / 2; i++) {

        }


        return root;
    }
}
