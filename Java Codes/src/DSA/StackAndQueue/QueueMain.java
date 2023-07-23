package DSA.StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(7);
        queue.insert(1);
        queue.insert(2);
        queue.insert(6);
        queue.display();
        queue.remove(); // O(n)
        queue.display();
        System.out.print("Element at Front : ");
        int front=queue.front();
        System.out.print(front);

        System.out.println();

        System.out.print("Element at Rear : ");
        int rear=queue.rear();
        System.out.print(rear);

    }
}
