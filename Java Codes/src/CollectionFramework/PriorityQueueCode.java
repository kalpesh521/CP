package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCode {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue();
        pq.offer(23);
        pq.offer(33);
        pq.offer(13);
        pq.offer(43);

        //Print min-heap
        System.out.println(pq);

        Queue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(12);
        pq2.offer(32);
        pq2.offer(2);
        pq2.offer(121);

        //print Max-heap
        System.out.println(pq2);

        pq2.poll();
        System.out.println(pq2);



    }
}
