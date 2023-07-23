package DSA.StackAndQueue;

/*Follow the steps below to solve the problem:

To implement push1():
First, check whether the top1 is greater than 0
If it is then add an element at the top1 index and decrement top1 by 1
Else return Stack Overflow
To implement push2():
First, check whether top2 is less than n – 1
If it is then add an element at the top2 index and increment the top2 by 1
Else return Stack Overflow
To implement pop1():
First, check whether the top1 is less than or equal to n / 2
If it is then increment the top1 by 1 and return that element.
Else return Stack Underflow
To implement pop2():
First, check whether the top2 is greater than or equal to (n + 1) / 2
If it is then decrement the top2 by 1 and return that element.
Else return Stack Underflow*/

 class  ArrayTwoStack {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor
    ArrayTwoStack(int n)
    {
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }

    // Method to push an element x to stack1
    void push1(int x)
    {

        // There is at least one empty
        // space for new element
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        }
        else {
            System.out.println("Stack Overflow"
                    + " By element : " + x);
            return;
        }
    }

    // Method to push an element
    // x to stack2
    void push2(int x)
    {

        // There is at least one empty
        // space for new element
        if (top2 < size - 1) {
            top2++;
            arr[top2] = x;
        }
        else {
            System.out.println("Stack Overflow"
                    + " By element : " + x);
            return;
        }
    }

    // Method to pop an element from first stack
    int pop1()
    {
        if (top1 <= size / 2) {
            int x = arr[top1];
            top1++;
            return x;
        }
        else {
            System.out.print("Stack UnderFlow");
            System.exit(1);
        }
        return 0;
    }

    // Method to pop an element
    // from second stack
    int pop2()
    {
        if (top2 >= size / 2 + 1) {
            int x = arr[top2];
            top2--;
            return x;
        }
        else {
            System.out.print("Stack UnderFlow");
            System.exit(1);
        }
        return 1;
    }

     public static void main(String[] args) {
        ArrayTwoStack ts = new ArrayTwoStack(5);
         ts.push1(5);
         ts.push2(10);
         ts.push2(15);
         ts.push1(11);
         ts.push2(7);
         System.out.println("Popped element from stack1 is "
                 + ": " + ts.pop1());
         ts.push2(40);
         System.out.println("Popped element from stack2 is "
                 + ": " + ts.pop2());
     }
};



