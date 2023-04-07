package org.gabota.neetcode.linkedlist;

public class MergeTwoSortedLists {
    // https://leetcode.com/problems/merge-two-sorted-lists
    public ReverseLinkedList.ListNode mergeTwoLists(ReverseLinkedList.ListNode list1, ReverseLinkedList.ListNode list2) {
        if(list1 == null && list2 ==null) {
            return null;
        }

        if (list1 == null){
            return list2;
        }

        if (list2 ==null) {
            return list1;
        }


        ReverseLinkedList.ListNode merged = new ReverseLinkedList.ListNode();
        ReverseLinkedList.ListNode mergedRoot = merged;
        while(list1 != null || list2 != null) {
            if(list2 == null) {
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
                continue;
            }

            if(list1 == null) {
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
                continue;
            }

            if (list1.val < list2.val) {
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
            } else {
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
            }
        }

        return mergedRoot.next;

    }
}
