package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*Queue internally implememented by LinkedList */
public class queueCode {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>()  ;
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(11);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());

    }
}
