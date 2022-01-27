package com.vss.code.recursion;

import com.vss.code.helpers.LinkedListHelper;
import org.junit.Test;

public class SwapNodesInPairsTest{

    @Test
    public void testSwapPairs_even() {
        SwapNodesInPairs unit = new SwapNodesInPairs();
        final ListNode head = LinkedListHelper.getList(10).getHead();
        head.print();
        final ListNode swappedHead = unit.swapPairs(head);
        swappedHead.print();
    }

    @Test
    public void testSwapPairs_odd() {
        SwapNodesInPairs unit = new SwapNodesInPairs();
        final ListNode head = LinkedListHelper.getList(5).getHead();
        head.print();
        final ListNode swappedHead = unit.swapPairs(head);
        swappedHead.print();
    }
}