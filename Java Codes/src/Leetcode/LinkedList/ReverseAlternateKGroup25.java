package Leetcode.LinkedList;

public class ReverseAlternateKGroup25 {
// https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k <= 1) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;


        while (current != null) {
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
            //Above program will return first three k nodes
            // Skip next k nodes
            for (int i = 0; i < k; i++) {
                prev = current;
                current = current.next;
            }
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


