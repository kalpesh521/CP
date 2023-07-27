package DSA.StackAndQueue;

public class StackUsingArray {


    static class Stack {
        private int[] data;
        private int top;
        private int capacity;

        Stack(int capacity) {
            this.capacity = capacity;
            this.data = new int[capacity];
            this.top = -1; // Initialize top to -1 to indicate an empty stack
        }

        public void push(int num) {
            if (isFull()) {
                System.out.println("Stack Overflow: Cannot push element. Stack is full.");
            } else {
                data[++top] = num;
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow: Cannot pop element. Stack is empty.");
                return -1; // Assuming -1 is not a valid element in the stack
            } else {
                return data[top--];
            }
        }

        public int top() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1; // Assuming -1 is not a valid element in the stack
            } else {
                return data[top];
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
        public int size(){
            return  top+1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a capacity of 5
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.top()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.isFull()); // Output: false
        System.out.println(stack.size()); // Output: false
    }
}
