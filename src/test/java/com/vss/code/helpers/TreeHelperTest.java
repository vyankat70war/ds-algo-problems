package com.vss.code.helpers;

import com.vss.code.model.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class TreeHelperTest {


    @Before
    public void setUp() {

    }

    @Test
    public void testGetIntegerTree() {
        final TreeNode root = TreeHelper.getIntegerTree(15);
        root.print();
    }
}