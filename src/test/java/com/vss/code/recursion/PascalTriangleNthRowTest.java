package com.vss.code.recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PascalTriangleNthRowTest {

    @Test
    public void testGetNthRow() {
        final List<Integer> list = PascalTriangleNthRow.getNthRow(3);
        Assert.assertEquals("size of nth row", 4, list.size());
        Assert.assertEquals("Compare list", Arrays.asList(1, 3, 3, 1), list);
    }
}