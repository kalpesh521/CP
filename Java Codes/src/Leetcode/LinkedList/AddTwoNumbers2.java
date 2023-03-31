package Leetcode.LinkedList;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //Created third node to add result
        ListNode head = new ListNode();
        ListNode l3 = head;
        int carry = 0;

        //traverse all nodes of both list
        while(l1!= null || l2!= null){

            //node contains value
            int l1_val= (l1!=null) ? l1.val :0;
            int l2_val= (l2!=null) ? l2.val :0;
            int current_sum = l1_val +l2_val+ carry;
            //carry
            carry = current_sum / 10;

            //last digit in output
            int last_digit = current_sum %10;

            //created newnode which will print last digit in output and traverse next
            ListNode newnode =new ListNode(last_digit);
            l3.next =newnode;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3= l3.next;

        }

        //created for carry and traverse next
        if(carry >0 ){
            ListNode newnode = new ListNode(carry);
            l3.next=newnode;
            l3 = l3.next;
        }

        return  head.next;
    }
}
