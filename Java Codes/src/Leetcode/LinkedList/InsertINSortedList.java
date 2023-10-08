package Leetcode.LinkedList;

public class InsertINSortedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key); // Create a new node with the given key
        Node current = head;
        Node prev = null;

        // Traverse the list to find the correct position to insert the new node
        while (current != null && current.data < key) {
            prev = current;
            current = current.next;
        }

        // If the new node needs to be inserted at the beginning
        if (prev == null) {
            newNode.next = head;
            head = newNode;
        }
        // Otherwise, insert it between prev and current
        else {
            prev.next = newNode;
            newNode.next = current;
        }

        return head; // Return the head of the updated linked list
    }
}

