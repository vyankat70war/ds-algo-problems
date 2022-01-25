package com.vss.code.recursion;

//  Definition for singly-linked list.
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode setNext(final ListNode next) {
        this.next = next;
        return next;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode next = this.getNext();
        while(next != null) {
            sb.append(next.getVal());
            next = next.getNext();
            if (next != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
