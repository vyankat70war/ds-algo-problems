package com.vss.code.recursion;

import com.vss.code.model.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(final ListNode head) {
        final ListNode result;

        if (head == null || head.getNext() == null) {
            result = head;
        } else {
            final ListNode next = reverseList(head.getNext());
            head.getNext().setNext(head);
            head.setNext(null);
            result = next;
        }

        return result;
    }
}
