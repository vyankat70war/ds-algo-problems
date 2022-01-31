package com.vss.code.helpers;


import com.vss.code.model.ListNodeInfo;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListHelperTest {

    public void setUp() {
    }

    @Test
    public void testGetList() {
        final ListNodeInfo listInfo = LinkedListHelper.getList(5);
        Assert.assertEquals("List size", 5, listInfo.getListSize());
        Assert.assertNotNull("List head", listInfo.getHead());
        Assert.assertNotNull("List last node", listInfo.getLast());
    }

    @Test
    public void testGetSortedList() {
        final ListNodeInfo listInfo = LinkedListHelper.getSortedList(5);
        Assert.assertEquals("List size", 5, listInfo.getListSize());
        Assert.assertNotNull("List head", listInfo.getHead());
        Assert.assertNotNull("List last node", listInfo.getLast());
        Assert.assertTrue("Sorted list", listInfo.getLast().getVal() > listInfo.getHead().getVal());
    }

    @Test
    public void testPrintList() {
        final ListNodeInfo listInfo = LinkedListHelper.getSortedList(5);
        listInfo.getHead().print();
        Assert.assertNotNull(listInfo);
    }
}