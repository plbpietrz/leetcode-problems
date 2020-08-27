package rhx.leetcode.problems0to9;

import rhx.leetcode.ListNode;

public class P2AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean walk = true;
        ListNode result = new ListNode();
        ListNode current = result;
        int v1, v2, c = 0;
        while (walk) {
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            } else {
                v1 = 0;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            } else {
                v2 = 0;
            }

            int v = v1 + v2 + c;
            current.val = v % 10;
            c = (v > 9) ? 1 : 0;

            if (l1 != null || l2 != null || c == 1) {
                current.next = new ListNode();
                current = current.next;
            } else {
                walk = false;
            }

        }
        return result;
    }
}
