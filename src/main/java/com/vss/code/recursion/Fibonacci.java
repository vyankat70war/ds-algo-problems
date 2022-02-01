package com.vss.code.recursion;

import java.util.HashMap;

public class Fibonacci {
    private static final HashMap<Integer, Integer> CACHE = new HashMap<>();

    public static int fib(final int n) {
        final int result;
        if (CACHE.containsKey(n)) {
            result = CACHE.get(n);
        } else {

            if (n < 2) {
                result = n;
            } else {
                result = fib(n - 1) + fib(n - 2);
            }
            CACHE.put(n, result);
        }
        return result;
    }
}
