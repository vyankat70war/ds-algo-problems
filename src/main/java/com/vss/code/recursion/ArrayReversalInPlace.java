package com.vss.code.recursion;

public class ArrayReversalInPlace {
    public int[] reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        reverse(arr, 0, arr.length - 1);
        return arr;
    }
    private void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        arr[start] = swap(arr[end], arr[end] = arr[start]);
        reverse(arr, start+1, end-1);
    }

    private int swap(int first, int second) {
        return first;
    }
}
