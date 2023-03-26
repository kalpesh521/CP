package Leetcode.LinkedList;

// If in case cycle forming problem ,use fast-slow pointer concept ,
// slow pointer move x times then fast pointer move 2x times
// they will meet (fast == slow) at any node in cycle forming list
public class LinkedListCycle141 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {

                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        //fast and slow pointer approach
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        // for null
        if (fast == null || fast.next == null) return null;

        //when head is equal to slow then it will return head
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

}
