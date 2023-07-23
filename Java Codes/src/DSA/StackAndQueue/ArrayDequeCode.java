package DSA.StackAndQueue;

import java.util.*;

public class ArrayDequeCode {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<Integer>();
        dq.push(5);
        dq.push(2);
        dq.push(1);
        dq.push(6);
        System.out.println(dq.peek());
        System.out.println(dq.pop());
        System.out.println(dq);
    }
}
