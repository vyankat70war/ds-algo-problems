package com.vss.code.helpers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayHelperTest  {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


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

    @Test
    public void test_print_null() {
        ArrayHelper.print(null);
        Assert.assertEquals("[]", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void test_print_nonNull() {
        ArrayHelper.print(new int[]{1, 2});
        Assert.assertEquals("[1,2]", outputStreamCaptor.toString()
                .trim());
    }
}