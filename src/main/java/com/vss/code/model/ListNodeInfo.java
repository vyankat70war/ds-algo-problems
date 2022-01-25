package com.vss.code.model;

import com.vss.code.recursion.ListNode;

public class ListNodeInfo {
    private ListNode head;
    private ListNode last;
    private int listSize;
    private boolean sorted;

    public ListNodeInfo(final ListNode head, final ListNode last, final int listSize) {
        this.head = head;
        this.last = last;
        this.listSize = listSize;
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getLast() {
        return last;
    }

    public int getListSize() {
        return listSize;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode next = head.getNext();
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
