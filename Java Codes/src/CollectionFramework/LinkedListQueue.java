package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(22);
        queue.offer(25);
        queue.offer(21);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());


    }
}
