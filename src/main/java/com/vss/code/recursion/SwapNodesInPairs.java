package com.vss.code.recursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        /**
         * sol 1
         */
//         ListNode nextHead = head.getNext();
//         ListNode next = nextHead.getNext();
//         nextHead.setNext( head );
//         head.setNext( swapPairs(next));
//         return nextHead;

        /**
         *   Sol 2
         */
//         ListNode next = head.getNext().getNext();
//
//         ListNode nextHead=swap(head.getNext(), head.setNext( head) );
//         nextHead.getNext().setNext( swapPairs(next));
//         return nextHead;

        /**
         * Sol 3
         */
        final ListNode next = head.getNext().getNext();
        head = swap1(head.getNext(), head.setNext( head));
        head.getNext().setNext(swapPairs(next));
        return head;

    }

    private ListNode swap(ListNode head, ListNode next) {
        head.setNext(next);
        return head;
    }

    private ListNode swap1(ListNode head, ListNode next) {
        next.setNext(head);
        head.setNext( next );
        return head;
    }
}

