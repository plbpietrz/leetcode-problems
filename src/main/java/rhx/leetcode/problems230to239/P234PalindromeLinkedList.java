package rhx.leetcode.problems230to239;

import rhx.leetcode.ListNode;

public class P234PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slowp = head, fastp = head;

        boolean takeNext = false;
        while(fastp.next != null) {
            if (fastp.next.next == null) {
                fastp = fastp.next;
                takeNext = true;
                break;
            } else {
                slowp = slowp.next;
                fastp = fastp.next.next;
            }
        }

        if (takeNext) {
            reverse(slowp.next);
            slowp.next = null;
        } else {
            reverse(slowp);
        }

        do {
            if (head.val != fastp.val)
                return false;
            head = head.next;
            fastp = fastp.next;
        } while (head != null);
        return true;
    }

    private void reverse(ListNode node) {
        ListNode prev = node, temp;
        node = node.next;
        prev.next = null;
        while(node != null) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new P234PalindromeLinkedList().isPalindrome(ListNode.of(1, 3, 2, 3, 1)));
    }
}
