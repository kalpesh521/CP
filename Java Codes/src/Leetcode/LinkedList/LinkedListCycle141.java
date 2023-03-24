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

}
