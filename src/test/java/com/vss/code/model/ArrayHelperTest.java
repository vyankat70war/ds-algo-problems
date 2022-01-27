package com.vss.code.model;

import com.vss.code.helpers.ArrayHelper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayHelperTest  {


    @Test
    public void testGetArray() {
        final int[] ints = ArrayHelper.getArray(5);
        Assert.assertEquals("Array Size should be equal to", 5, ints.length);
    }

    @Test
    public void testGetSortedArray() {
        final int[] ints = ArrayHelper.getSortedArray(5);
        Assert.assertEquals("Array Size should be equal to", 5, ints.length);
        Assert.assertTrue("Array vales should be sorted", ints[0] <= ints[ints.length-1]);
    }
}