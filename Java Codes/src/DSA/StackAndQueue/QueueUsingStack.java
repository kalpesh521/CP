package DSA.StackAndQueue;

import java.util.*;
/*
 (By making deQueue operation costly): In this method, in en-queue operation, the new element is entered at the top
 of stack1. In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.

enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
Here time complexity will be O(n)
*/


public class QueueUsingStack {

    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();


    public void push(int x) {
        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }

        stk1.push(x);
        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }
    }

    public int pop() {
        return stk1.pop();
    }

    public int peek() {
        return stk1.peek();
    }

    public boolean empty() {
        return stk1.isEmpty();
    }


    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    /* Driver function to test above functions */
    public static void main(String args[]) {
        /* Create a queue with items 1 2 3*/

    }


}