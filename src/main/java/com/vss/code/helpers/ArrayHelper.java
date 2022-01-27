package com.vss.code.helpers;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayHelper {
    public static int[] getArray(int size) {
        return getInts(size, false);
    }

    public static int[] getSortedArray(int size) {
        return getInts(size, true);
    }

    private static int[] getInts(final int size, final boolean sorted) {
        Random random = new Random();
        final IntStream intStream = random.ints(size, 1, size * 11);
        int[] ints;
        if (sorted) ints = intStream.sorted().toArray();
        else ints = intStream.toArray();
        return ints;
    }

    public static void print(final int[] arr) {
        if (arr == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            final int value = arr[i];
            sb.append(value);
            if (i == arrLength - 1) {
                continue;
            }
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
