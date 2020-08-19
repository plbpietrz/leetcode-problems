package rhx.leetcode;

public class Problem19RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toRemove = head;
        ListNode iterator = head;
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
