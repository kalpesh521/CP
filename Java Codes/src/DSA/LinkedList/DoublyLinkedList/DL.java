package DSA.LinkedList.DoublyLinkedList;

import java.util.logging.SocketHandler;

public class DL {
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    //Function to insert value
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;
    }

    public  void  insertLast(int val){
        Node node =new Node(val);
        Node last =head;
        node.next=null;

        //if list is empty
        if(head == null){
            node.prev=null;
            head=node;
            return ;
        }

        //traverse upto last then add node by linking
        while(last.next != null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
    }
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last=node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse order ");
        while (last !=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }
}
