package com.vss.code.recursion;

import com.vss.code.helpers.LinkedListHelper;
import com.vss.code.model.ListNode;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest{

    private ReverseLinkedList unit;

    @Before
    public void setUp() {
        unit = new ReverseLinkedList();
    }

    @Test
    public void testReverseList() {
        final ListNode head = LinkedListHelper.getList(15).getHead();
        head.print();
        final ListNode reversedHead = unit.reverseList(head);
        reversedHead.print();
    }

    @Test
    public void testReverseSortedList() {
        final ListNode head = LinkedListHelper.getSortedList(5).getHead();
        head.print();
        final ListNode reversedHead = unit.reverseList(head);
        reversedHead.print();
    }
}