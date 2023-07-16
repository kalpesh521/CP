package CollectionFramework;

import java.util.ArrayDeque;

//Faster , constant time
public class ArrayDequeCode {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrdq= new ArrayDeque<>();
        arrdq.offer(23);
        arrdq.offerFirst(34);
        arrdq.offerLast(12);
        arrdq.offer(45);
        System.out.print(" Array Deque : "+" "+arrdq);
        //The ArrayDeque object is printed using its toString() method, which returns a string representation
        // of the collection.This will print the elements enclosed in square brackets, separated by commas.

        System.out.println();

        arrdq.forEach((x)-> System.out.print(x+" "));

        System.out.println(arrdq.peek());
        arrdq.pollFirst();
        arrdq.pollLast();
        arrdq.poll();
        System.out.println(arrdq);
    }
}
