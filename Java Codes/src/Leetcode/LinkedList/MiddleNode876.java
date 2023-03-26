package Leetcode.LinkedList;

public class MiddleNode876 {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { // Not reched at last (tail)
            slow = slow.next; // x <Slow will be at middle when fast at tail
            fast = fast.next.next; // 2x
        }
        return slow;

    }
}
