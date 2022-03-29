package com.vss.code.recursion;

import com.vss.code.model.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeLists(final ListNode list1, final ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.getVal() <= list2.getVal()) {
            list1.setNext(mergeLists(list1.getNext(), list2));
            return list1;
        } else {
            list2.setNext(mergeLists(list1, list2.getNext()));
            return list2;
        }
    }
}
