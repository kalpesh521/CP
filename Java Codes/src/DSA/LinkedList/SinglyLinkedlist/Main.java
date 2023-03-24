package DSA.LinkedList.SinglyLinkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserLast(3);
        list.inserLast(1);
        list.inserLast(5);
        list.inserLast(12);
        list.insertLast(99);
        list.insert(52,3);


        list.display();
        System.out.println(list.Deletefirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();System.out.println(list.deleteIndex(2));
        list.display();
//        System.out.println(list.Find(3));


        LL lst2 = new LL();
        lst2.insertLast(1);
        lst2.insertLast(1);
        lst2.insertLast(2);
        lst2.insertLast(3);
        lst2.display();
        lst2.removeDuplicates();
        lst2.display();
    }
}
