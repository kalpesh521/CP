package DSA.LinkedList.SinglyLinkedlist;

import Leetcode.LinkedList.LinkedListCycle141;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.inserLast(3);
//        list.inserLast(1);
//        list.inserLast(5);
//        list.inserLast(12);
//        list.insertLast(99);
//        list.insert(52,3);
//
//
//        list.display();
//        System.out.println(list.Deletefirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();System.out.println(list.deleteIndex(2));
//        list.display();
////        System.out.println(list.Find(3));
//
//
//        LL lst2 = new LL();
//        lst2.insertLast(1);
//        lst2.insertLast(1);
//        lst2.insertLast(2);
//        lst2.insertLast(3);
//        lst2.display();
//        lst2.removeDuplicates();
//        lst2.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(7);
        second.insertLast(9);

        LL ans = LL.merge(first,second);
        ans.display();

        LinkedListCycle141 lst =new LinkedListCycle141();

    }
}
