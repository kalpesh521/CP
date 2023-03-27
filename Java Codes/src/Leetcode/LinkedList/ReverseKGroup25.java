package Leetcode.LinkedList;

public class ReverseKGroup25 {

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {

            if (head == null || k <= 1) {
                return head;
            }
            ListNode current = head;
            ListNode prev = null;
            //The group less than k should not be reverse so used getlength() and count function
            int length = getLength(head);
            int count = length / k;
            while (count > 0) {
                // reverse  left and right (right - left +1 )
                ListNode last = prev;
                ListNode newEnd = current;
                ListNode next = current.next;
                for (int i = 0; current != null && i < k; i++) {

                    current.next = prev;
                    prev = current;
                    current = next;
                    if (next != null) {
                        next = next.next;
                    }

                }

                if (last != null) {
                    last.next = prev;

                } else {
                    head = prev;
                }

                newEnd.next = current;

                if (current == null) {
                    break;
                }
                prev = newEnd;
                count--;
            }
            return head;
        }

        public int getLength(ListNode head) {
            ListNode node = head;
            int length = 0;
            while (node != null) {
                length++;
                node = node.next;
            }
            return length;
        }
    }

}
