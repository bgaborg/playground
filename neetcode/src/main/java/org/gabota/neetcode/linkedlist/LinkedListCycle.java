package org.gabota.neetcode.linkedlist;

public class LinkedListCycle {
    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ReverseLinkedList.ListNode head) {
        if (head == null) {
            return false;
        }

        if (head.next == null) {
            return false;
        }

        ReverseLinkedList.ListNode f = head.next.next;

        while (head!=null && f != null) {
            if (head.next == null || f.next == null || f.next.next == null) {
                return false;
            }
            f = f.next.next;
            head = head.next;
            if (f == head) return true;
        }

        return false;
    }

}
