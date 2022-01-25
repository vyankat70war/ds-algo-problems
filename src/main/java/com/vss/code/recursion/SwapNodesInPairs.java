package com.vss.code.recursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        /**
         * sol 1
         */
        // ListNode nextHead = head.next;
        // ListNode next = nextHead.next;
        // nextHead.next = head;
        // head.next = swapPairs(next);
        // return nextHead;

        /**
         *   Sol 2
         */
//         ListNode next = head.next.next;

//         ListNode nextHead=swap(head.next, head.next = head);
//         nextHead.next.next = swapPairs(next);
//         return nextHead;

        /**
         *   Sol 3
         */
        head = swap1(head.next, head.next = head);
        head.next.next = swapPairs(head.next.next);
        return head;

    }

    private ListNode swap(ListNode head, ListNode next) {
        head.next = next;
        return head;
    }

    private ListNode swap1(ListNode head, ListNode next) {
        next.next = head.next;
        head.next = next;
        return head;
    }
}

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
