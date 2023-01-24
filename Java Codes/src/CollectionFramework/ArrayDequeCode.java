package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeCode {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrdq= new ArrayDeque<>();
        arrdq.offer(23);
        arrdq.offerFirst(34);
        arrdq.offerLast(12);
        arrdq.offer(45);
        System.out.println(arrdq);

        System.out.println(arrdq.peek());
        arrdq.pollFirst();
        arrdq.pollLast();
        arrdq.poll();
        System.out.println(arrdq);
    }
}
