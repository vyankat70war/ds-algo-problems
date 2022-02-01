package com.vss.code.recursion;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        final int result = Fibonacci.fib(5);
        Assert.assertEquals("Fibonacci number is ", 5, result);
    }
}