package DSA.StackAndQueue;

import java.util.Queue;

public class QueueUsingArray {
    private int arr[];
    private int start, end, currsize, top, maxsize , newElement;

    public QueueUsingArray() {
        arr = new int[maxsize];
        start = -1;
        end = -1;
        currsize = 0;
    }  public QueueUsingArray( int maxsize) {
        this.maxsize=maxsize;
        arr = new int[maxsize];
        start = -1;
        end = -1;
        currsize = 0;
    }

    public void push(int newElement ) {
        if (currsize == maxsize) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;

        } else {
            end = (end + 1) % (maxsize);

        }
        arr[end] = newElement;
        System.out.println("Newelemnt is " + newElement);
        currsize++;

    }

    public int pop() {
        if (start == -1) {
            System.out.println("empty");
            System.exit(1);
        }
        int popped = arr[start];
        if (currsize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxsize;
        }
        currsize--;
        return popped;
    }

    public int top(){
        return arr[start];
    }
    public int size(){
        return currsize;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
