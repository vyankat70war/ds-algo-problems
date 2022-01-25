package com.vss.code.model;


import com.vss.code.recursion.ListNode;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LinkedListHelper {

    public static ListNodeInfo getSortedList(int size) {
        return getListNodeInfo(size, true);
    }

    public static ListNodeInfo getList(final int nodeCount) {
        return getListNodeInfo(nodeCount, false);
    }

    private static ListNodeInfo getListNodeInfo(final int nodeCount, final boolean sort) {
        Random random = new Random();
        final IntStream intStream = random.ints(nodeCount, 1, nodeCount * 3);
        final AtomicReference<ListNode> head = new AtomicReference<>();
        final AtomicReference<ListNode> current = new AtomicReference<>();

        if (sort) {
            intStream.sorted()
                    .forEach(val -> addToList(head, current, val));
        } else {
            intStream
                    .forEach(val -> addToList(head, current, val));
        }
        return new ListNodeInfo(head.get(), current.get(), nodeCount);
    }

    private static void addToList(final AtomicReference<ListNode> head, final AtomicReference<ListNode> current, final int val) {
        final ListNode node = new ListNode(val);
        if(head.get() == null) {
            current.set(node);
            head.set(current.get());
        }else {
            current.get().setNext(node);
            current.set(node);
        }
    }
}
