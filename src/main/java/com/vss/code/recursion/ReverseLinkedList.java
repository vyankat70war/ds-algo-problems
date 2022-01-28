package com.vss.code.recursion;

import com.vss.code.model.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.getNext() == null){
            return head;
        }

        final ListNode next = reverseList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return next;
    }
}
