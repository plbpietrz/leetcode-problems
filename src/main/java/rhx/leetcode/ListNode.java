package rhx.leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int...vals) {
        ListNode node = new ListNode(vals[0]);
        ListNode head = node;
        for (int i = 1; i < vals.length; ++i) {
            node.next = new ListNode(vals[i]);
            node = node.next;
        }
        return head;
    }
}
