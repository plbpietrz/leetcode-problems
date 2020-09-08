package rhx.leetcode.to499.to99.to19;

import rhx.leetcode.ListNode;

public class P19RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode iterator = head;
        ListNode toRemove = head;
        while(iterator.next != null) {
            if (n == 0) {
                toRemove = toRemove.next;
            } else {
                n -= 1;
            }
            iterator = iterator.next;
        }
        if (n != 0) {
            return toRemove.next;
        } else {
            toRemove.next = toRemove.next.next;
            return head;
        }
    }

}
