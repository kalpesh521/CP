package Leetcode.LinkedList;
//Input: head = [1,2,2,1]
//Output: true

public class PallindromeList234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid); //Second half
        ListNode rerevers = headSecond;
    // check first and second half
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(rerevers);
        return head == null || headSecond == null;
    }

    // Function to find middle node
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { // Not reched at last (tail)
            slow = slow.next; // x <Slow will be at middle when fast at tail
            fast = fast.next.next; // 2x
        }
        return slow;

    }

    // function to reverse list
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
