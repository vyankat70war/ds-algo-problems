package com.vss.code.recursion;

import com.vss.code.model.LinkedListHelper;
import org.junit.Test;

public class SwapNodesInPairsTest{

    @Test
    public void testSwapPairs() {
        SwapNodesInPairs unit = new SwapNodesInPairs();
        final ListNode head = LinkedListHelper.getList(10).getHead();
        head.print();
        final ListNode swappedHead = unit.swapPairs(head);
        swappedHead.print();
    }
}