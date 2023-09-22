package DSA.Trees;

import java.util.Scanner;

public class CreateBT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary tree elements (enter -1 to terminate):");
        Node root = createTree(sc);
        sc.close();

        // You can perform operations on the 'root' here, e.g., traversals or other tree-related tasks.
    }

    static Node createTree(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        System.out.println("Enter left child for " + data + ":");
        Node left = createTree(sc);

        System.out.println("Enter right child for " + data + ":");
        Node right = createTree(sc);

        return new Node(data, left, right);
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
