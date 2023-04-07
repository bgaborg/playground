package org.gabota.neetcode.linkedlist;

public class ReverseLinkedList {
    // https://leetcode.com/problems/reverse-linked-list/
    public static class ListNode {
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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode head = this;
            while (head != null) {
                sb.append(head.val);
                head = head.next;
                if (head != null) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode t = head.next;
            head.next = prev;
            prev = head;
            head = t;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        System.out.println(head);
        System.out.println(reverseList(head));
    }
}
