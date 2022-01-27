package com.vss.code.recursion;

import com.vss.code.helpers.ArrayHelper;
import org.junit.Before;
import org.junit.Test;

public class ArrayReversalInPlaceTest {

    private ArrayReversalInPlace unit;

    @Before
    public void setUp() {
        unit = new ArrayReversalInPlace();
    }

    @Test
    public void testReverseArray_even() {
        int[] arr = ArrayHelper.getArray(10);
        ArrayHelper.print(arr);
        arr = unit.reverseArray(arr);
        ArrayHelper.print(arr);
    }

    @Test
    public void testReverseArray_odd() {
        int[] arr = ArrayHelper.getArray(5);
        ArrayHelper.print(arr);
        arr = unit.reverseArray(arr);
        ArrayHelper.print(arr);
    }

    @Test
    public void testReverseArray_null() {
        int[] arr = null;
        ArrayHelper.print(arr);
        arr = unit.reverseArray(arr);
        ArrayHelper.print(arr);
    }
}