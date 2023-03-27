package Leetcode.LinkedList;

public class ReorderList143 {

    public void reorderList(ListNode head) {
         if(head== null || head.next ==null){
             return;
         }
         ListNode mid = middleNode(head);
         ListNode headsecond = reverse(mid);
         ListNode headfirst =head;

         while (headfirst !=null && headsecond != null){
             //created temp to point the previous list headfirst
             ListNode temp= headfirst.next;
             headfirst.next =headsecond;
             headfirst= temp;

             temp = headsecond.next;
             headsecond.next=headfirst;
             headsecond=temp;

         }
         //Next of trail to null
         if(headfirst !=null){
             headfirst.next=null;
         }
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
