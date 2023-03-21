package DSA.LinkedList.SinglyLinkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(5);
        list.insertFirst(12);
        list.insertLast(99);
        list.insert(52,3);


        list.display();
    }
}
