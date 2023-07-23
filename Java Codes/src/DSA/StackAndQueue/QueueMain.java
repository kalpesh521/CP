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
        queue.remove();
        queue.display();
        System.out.println("Element at Front :");
        int front=queue.front();
        System.out.println(front);

    }
}
