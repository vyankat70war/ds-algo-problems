package com.vss.code.model;

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

}
