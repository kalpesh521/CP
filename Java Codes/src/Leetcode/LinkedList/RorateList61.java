package Leetcode.LinkedList;

public class RorateList61 {

    public ListNode rotateRight(ListNode head, int k) {

        //check if head is null
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        //Traverse entire list upto last
        ListNode last = head;
        int length = 1;

        while (last.next != null) {
            last = last.next;
            length++;
        }
        // last became head
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newlast = head;

        //traverse upto newLast (skip-1)
        for (int i = 0; i < skip - 1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;

        return head;
    }


}
