package com.vss.code.recursion;

import com.vss.code.helpers.LinkedListHelper;
import com.vss.code.model.ListNode;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists unit;

    @Before
    public void setup() {
        unit = new MergeTwoSortedLists();

    }

    @Test
    public void testMergeLists() {
        final ListNode list1 = LinkedListHelper.getSortedList(5).getHead();
        list1.print();
        final ListNode list2 = LinkedListHelper.getSortedList(5).getHead();
        list2.print();
        final ListNode mergedListHead = unit.mergeLists(list1, list2);
        mergedListHead.print();
    }
}