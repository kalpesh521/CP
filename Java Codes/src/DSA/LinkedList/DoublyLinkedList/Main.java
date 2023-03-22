package DSA.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DL list = new DL();
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(5);
        list.insertFirst(12);
        list.display();
        list.insertLast(99);
        list.display();
        list.InsertAfter(5,21);
        list.display();
    }
}
