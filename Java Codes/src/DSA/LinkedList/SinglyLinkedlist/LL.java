package DSA.LinkedList.SinglyLinkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Insertion in Linkedlist
    public void inserLast(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Insert at last
    public void insertLast(int val) {
        if (tail == null) {
            inserLast(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    //Insert at index
    public void insert(int val, int index) {
        if (index == 0) {
            inserLast(val);
        }
        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete First
    public int Deletefirst() {
        int val = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        Node secondlast = get(size - 2);
        int val = head.val;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index) {
        if (index == 0) {
            Deletefirst();
        }
        if (index == size - 1) {
            deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        return val;
    }

    //Delete last node
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    //Find node in list

    public Node Find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value)
                return node;
            node = node.next;
        }

        return null;
    }

    //Function to display LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //Leetcode Questions

    public void removeDuplicates(){
        Node node =head;
        while (node.next !=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }

        }
        tail=node;
        tail.next=null;
    }
}
